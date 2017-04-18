package main.scala.structurerecursion.patternmatching

object PatternMatching {

    def main(args : Array[String]): Unit = {
        println("--- Pattern Matching ---")

        val b : B = B()
        val c : C = C()

        val a : A = A(b, c)

        checkProduct(a)

        val d : D = D()

        checkSum(d)

    }

    /**
      * Pattern matching for the product pattern
      */
    def checkProduct(a : A) : A =  {
        a match {
            case A(b, c) => a
            case _ => throw new IllegalArgumentException("Implementation doesn't exist")
        }
    }

    /**
      * Pattern matching for the sum pattern
      */
    def checkSum(d : D) : D = {
        d match {
            case _ : E => d
            case _ => throw new IllegalArgumentException("Implementation doesn't exist")
        }
    }
}

trait E
case class B()
case class C()
case class A(b : B, c : C)
case class D() extends E