package main.scala.algebraicdatatypes.sumpattern

object SumPattern {

    def main(args : Array[String]) {



        println("Here!")
    }
}

// Model data that is two or more distinct cases
// A is a B or C
sealed trait A
case class B() extends A
case class C() extends A