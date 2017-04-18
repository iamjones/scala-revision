package main.scala.structurerecursion.polymorphism

object Polymorphism {

    def main(args : Array[String]) {

        val b : A = B()
        b.foo()

        val c : A = C()
        c.foo()
    }
}

sealed trait A {
    def foo()
}

case class B() extends A {

    def foo(): Unit = {
        println("This is B")
    }
}

case class C() extends A {

    def foo(): Unit = {
        println("This is C")
    }
}