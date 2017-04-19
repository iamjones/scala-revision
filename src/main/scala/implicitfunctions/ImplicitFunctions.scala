package main.scala.implicitfunctions

object ImplicitFunctions {

    def main(args : Array[String]) {
        println("--- Implicit Functions ---")

        // This will produce a rectangle object with a width of 8 and a height of 20
        val rectangle : Rectangle = (8, 20)
        println(rectangle)
    }

    implicit def getRectangle(d : (Int, Int)) : Rectangle = {
        Rectangle(d._1, d._2)
    }
}

case class Rectangle(width: Int, height: Int)
