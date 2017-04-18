package main.scala.algebraicdatatypes.productpattern

object ProductPattern {

    def main(args : Array[String]) {



        println("Here!")
    }
}

// Model data that contains other data
// A has a B and C
trait B
trait C
case class A(b : B, c : C)

// or can be represented by a trait
trait AA {
    def b : B
    def c : C
}