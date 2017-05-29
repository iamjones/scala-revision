package main.scala.akka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object StudentSimulatorApp extends App {

    // Create the actor system
    val actorSystem = ActorSystem("UniversityApp")

    // Construct an actor ref
    val teacherActorRef : ActorRef = actorSystem.actorOf(Props(new TeacherActor))

    teacherActorRef ! "Hello"
    teacherActorRef ! "Bye"
    teacherActorRef ! "Hello"
    teacherActorRef ! "Hello"

    Thread.sleep(2000)

    actorSystem.terminate()
}

class TeacherActor extends Actor {
    override def receive : Receive = {
        case "Hello" => println("Hello Dave!")
        case "Bye" => println("Goodbye Dave!")
    }
}