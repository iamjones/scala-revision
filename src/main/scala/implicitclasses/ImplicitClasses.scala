package main.scala.implicitclasses

object ImplicitClasses {

    def main(args : Array[String]): Unit = {
        println("--- Implicit Classes ---")

        case class Rectangle(width: Int, height: Int)

        implicit class RectangleMaker(width: Int) {
            def x(height: Int): Rectangle = {
                Rectangle(width, height)
            }
        }

        // This will make a class of rectangle with a width 5 and a height of 10
        val rec : Rectangle = 5 x 10
        println(rec)
    }
}