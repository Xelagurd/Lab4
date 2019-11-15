package lab4;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.AllDirectives;
import akka.stream.ActorMaterializer;

import java.io.IOException;

public class JSTester extends AllDirectives {

    static ActorRef master;

    public static void main(String[] args) throws IOException {
        /*а. Создаем actor system*/
        ActorSystem systemq = ActorSystem.create("routes");
        /*в. После инициализации actor system — создаем актор роутер который в свою очередь создает все дочерние акторы */
        master = systemq.actorOf(Props.create(MasterActor.class));
        final Http httpser = Http.get(systemq);
        /*г. Создаем ActorMaterializer и инициализируем http систему */
        final ActorMaterializer materializer = ActorMaterializer.create(systemq);

        JSTester instance = new JSTester();
    }
}

