package main.scala.signallingerrors

object SignallingErrors {

    def main(args : Array[String]) {
        println("--- Signalling Errors ---")

        val p = inter(1, 10, 1, 10)
        println("Object should be NoPoint: " + p.getClass)

        val j = inter(1, 1, 10, 10)
        println("Object should be Point: " + j.getClass)

        val pOption = interOption(1, 10, 1, 10)
        println("Object should be None: " + pOption.getClass)

        val jOption = interOption(1, 1, 10, 10)
        println("Object should be Some: " + jOption.getClass)

    }

    /**
      * Function that calculates the intersection of two lines on a graph.
      * If the lines are parallel then NoPoint is returned otherwise Point is returned.
      *
      * @param m1 Double
      * @param b1 Double
      * @param m2 Double
      * @param b2 Double
      * @return OptionalPoint
      */
    def inter (m1 : Double , b1 : Double , m2 : Double , b2 : Double) : OptionalPoint = {
        if (m1 - m2 == 0) {
            NoPoint()
        }
        else {
            val x = (m1 - m2) / (b2 - b1)
            Point(x , m1 * x + b1)
        }
    }

    /**
      * Some function as above but using Scala Option type
      *
      * @param m1 Double
      * @param b1 Double
      * @param m2 Double
      * @param b2 Double
      * @return OptionalPoint
      */
    def interOption (m1 : Double , b1 : Double , m2 : Double , b2 : Double) : Option[Point] = {
        if (m1 - m2 == 0) {
            None
        }
        else {
            val x = (m1 - m2) / (b2 - b1)
            Some(Point(x , m1 * x + b1))
        }
    }
}

sealed trait OptionalPoint
case class Point(x : Double, y : Double) extends OptionalPoint
case class NoPoint() extends OptionalPoint
