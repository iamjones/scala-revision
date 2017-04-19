package main.scala.streams

object Streams {

    def main(args : Array[String]): Unit = {
        println("--- Streams ---")

        // This will give us an infinite stream of integers
        val ns = from(1)

        println(ns)
        println(ns.tail)
        println(ns.tail.tail)
        println(ns.tail.tail.tail)
        println(ns.tail.tail.tail.tail)

    }

    def from(n: Int) : Stream[Int] = {
        n #:: from(n + 1)
    }
}
