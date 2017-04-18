package main.scala.algebraicdatatypes.isaandpattern

object IsAAndPattern {

    def main(args : Array[String]) {



        println("Here!")
    }
}

// A trait that can be extended with many traits
trait B
trait C
case class A() extends B with C