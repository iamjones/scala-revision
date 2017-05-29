package akka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * We are going to send a message to ActorA and then ActorA will send a
  * message to ActorB and ActorB will send a message back to ActorA
  */
object RequestAndResponse extends App {
    println("------ Request and Response in AKKA ------")

    val system = ActorSystem("RequestResponse")

    val actorB = system.actorOf(Props(new ActorB))
    val actorA = system.actorOf(Props(new ActorA(actorB)))

    actorA ! "Init"

    Thread.sleep(2000)

    system.terminate()
}


class ActorA(actorB : ActorRef) extends Actor {

    override def receive : Receive = {
        case "Init" => actorB ! "Hello"
        case "Response" => println("We got our response successfully")
    }
}

class ActorB extends Actor {

    override def receive : Receive = {
        case "Hello" => sender ! "Response"
    }
}