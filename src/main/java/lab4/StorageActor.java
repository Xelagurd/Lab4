package lab4;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class StorageActor extends AbstractActor {
    /*б. В приложении будем использовать следующие акторы :
    - актор который хранит результаты тестов.
   Обрабатывает следующие сообщения :
   cообщение с результатом одного теста -> кладет его в локальное хранилище.
   Сообщение с запросом результата теста → отвечает сообщением с  результатом всех тестов для заданного  packageId */

    private Map<String, Map<String, String>> storage = new HashMap<>();

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(StoreMessage.class, m -> {
                })
                .match(GetMessage.class, req -> sender().tell(
                        new FullAnswer(req.getPackageId(), storage.get(req.getPackageId())), self())
                ).build();
    }
}