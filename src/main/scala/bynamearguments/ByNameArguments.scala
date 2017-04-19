package main.scala.bynamearguments

object ByNameArguments {

    def main(args: Array[String]): Unit = {

        // Hello should print before world
        world(hello())

        // We can make sure the argument function is executed after
        world2(hello())
    }

    def hello(): Int = {
        println("Hello")
        10
    }

    def world(x : Int): Unit = {
        println("World")
    }

    /**
      * => means that x isn't evaluated until its needed.
      * If x is never used then the argument is ignored.
      *
      * @param x Int
      * @return Int
      */
    def world2(x : => Int): Int = {
        println("World")
        x + 10
    }
}
