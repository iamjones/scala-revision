package main.scala.generics

object Generics {

    def main(args : Array[String]): Unit = {
        println("--- Generics ----")

        val lengthOfString : Int = lengthString(List("a", "b", "c"))
        println(s"Length of strings: $lengthOfString")

        val lengthOfInt : Int = lengthInt(List(1, 2, 3, 4, 5))
        println(s"Length of ints: $lengthOfInt")

        // By using generics the above can be refactored to one function
        val lengthOfStringAny : Int = lengthAny(List("a", "b", "c"))
        println(s"Length of strings using generics: $lengthOfStringAny")

        val lengthOfIntAny : Int = lengthAny(List(1, 2, 3, 4, 5))
        println(s"Length of ints using generics: $lengthOfIntAny")
    }

    /**
      * Recursively calculates the length of a list of string
      *
      * @param ls List[String]
      * @return Int
      */
    def lengthString(ls : List[String]) : Int = {
        ls match {
            case hd :: tl => 1 + lengthString(tl)
            case Nil      => 0
        }
    }

    /**
      * Recursively calculates the length of a list of integers
      *
      * @param ls List[String]
      * @return Int
      */
    def lengthInt(ls : List[Int]) : Int = {
        ls match {
            case hd :: tl => 1 + lengthInt(tl)
            case Nil      => 0
        }
    }

    /**
      * Recursively calculates the length of a list
      *
      * @param ls List[A]
      * @return Int
      */
    def lengthAny[A](ls : List[A]) : Int = {
        ls match {
            case hd :: tl => 1 + lengthAny(tl)
            case Nil      => 0
        }
    }
}

