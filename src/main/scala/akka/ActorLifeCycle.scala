package akka

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

/**
  * Created by davidjones on 31/05/2017.
  */
object ActorLifeCycle extends App {

    val system = ActorSystem("ActorLifeCycle")

    val actor = system.actorOf(Props(new SimpleActor))

    actor ! "Test"

    Thread.sleep(2000)

    system.terminate()
}

class SimpleActor extends Actor with ActorLogging {

    override def preStart(): Unit = {
        log.info("Simple actor pre start")
    }

    override def receive: Receive = {
        case "Test" => log.info("Test actor message received")
    }

    override def postStop() : Unit = {
        log.info("Simple actor post stop")
    }
}