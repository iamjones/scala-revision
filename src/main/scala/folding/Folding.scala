package main.scala.folding


object Folding {

    def main(args : Array[String]): Unit = {
        println("--- Folding ---")

        // Functions can produce other functions
        val addSomething = addSome(4)
        println("Should print 14: " + addSomething(10))

        // Functions do not need names
        val n = ((x : Int, y : Int) => x + y)(1, 6)
        println(s"Should print 7: $n")

        // Functions can be stored in data structures
        val f = MyFunctions((x : Int, y : Int) => x + y)
        val x = f.x(6, 4)
        println(s"Should print 10: $x")

    }

    /**
      * Takes an integer and returns a function that take another integer
      * and adds them together. Resulting in the sum of both integers.
      *
      * @param n Int
      * @return (Int => Int)
      */
    def addSome(n : Int) = (y : Int) => {
        n + y
    }
}

case class MyFunctions(x : (Int, Int) => Int)
