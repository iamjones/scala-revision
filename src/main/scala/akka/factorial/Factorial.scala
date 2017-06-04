package akka.factorial

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

import scala.annotation.tailrec

object Factorial extends App {

    println("-------- Akka - Factorial --------")

    val system = ActorSystem("factorialApp")

    val ls : List[Int] = List(4, 5, 6)

    val factorialActor : ActorRef = system.actorOf(Props(new FactorialCollectorActor(ls)))

    Thread.sleep(2000)

    system.terminate()
}

class FactorialCollectorActor(ls : List[Int]) extends Actor {

    ls.foreach(n => context.actorOf(Props(new FactorialActor)) ! n)


    def receive : Receive = {
        case n : Int => println(s"Total: $n")
    }
}

class FactorialActor extends Actor {

    def receive: Receive = {

        case num : Int => sender ! calculate(num, 1)

        @tailrec def calculate(num : Int, total : Int): Int = {

            num match {
                case 0 => total
                case _ => calculate(num - 1, total * num)
            }
        }
    }
}
