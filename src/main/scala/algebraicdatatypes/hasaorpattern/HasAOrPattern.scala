package main.scala.algebraicdatatypes.hasaorpattern

object HasAOrPattern {
    def main(args : Array[String]) {
        println("Here!")
    }
}

// A has a B or C
trait A {
    def d : D
}
sealed trait D
case class B() extends D
case class C() extends D

// Also can be implemented with
sealed trait AA
case class E(b : B) extends AA
case class F(c : C) extends AA