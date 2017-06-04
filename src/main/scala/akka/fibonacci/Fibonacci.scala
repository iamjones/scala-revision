package akka.fibonacci

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Fibonacci extends App {

    println("-------- Akka - fibonacci --------")

    val system = ActorSystem("fibonacciSystem")

    val fibonacciActor : ActorRef = system.actorOf(Props(new FibonacciActor))

    fibonacciActor ! 10

    Thread.sleep(2000)

    system.terminate()
}

class FibonacciActor extends Actor {

    def receive : Receive = {
        case n : Int => doFibonnacci(n, List(1))
    }

    def doFibonnacci(num : Int, seq : List[Int]) : List[Int] = {
        num match {
            case 0 => {
                println(seq.toString())
                seq
            }
            case _ => doFibonnacci(num - 1, seq.sum :: seq)
        }
    }
}
