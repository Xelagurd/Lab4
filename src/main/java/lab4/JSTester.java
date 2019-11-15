package lab4;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.http.javadsl.server.AllDirectives;

import java.io.IOException;

public class JSTester extends AllDirectives {

    static ActorRef master;

    public static void main(String[] args) throws IOException {
        /*а. Создаем actor system*/
        ActorSystem systemq = ActorSystem.create("routes");
        /*в. После инициализации actor system — создаем актор роутер который в свою очередь создает все дочерние акторы */
        master = systemq.actorOf(Props.create(MasterActor.class));
        final Http httpser = Http.get(systemq);
    }
}

