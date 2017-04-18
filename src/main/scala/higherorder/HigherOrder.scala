package main.scala.higherorder

object HigherOrder {

    def main(args : Array[String]): Unit = {
        println("--- Higher Order ---")

        val intList = List(1, 2, 3)
        println("Incremented values: " + incrs(intList))

        val stringList = List("one", "two", "three")
        println("String lengths: " + lengths(stringList))

        // The incrs function and lengths function are quite similar so
        // we could refactor them to take a higher order function as a
        // parameter. For example.
        def f(i : Int) : Int = i + 1
        println("Incremented values (doMap): " + doMap[Int, Int](f, intList))

        def s(i : String) : Int = i.length
        println("String lengths (doMap): " + doMap[String, Int](s, stringList))

    }

    /**
      * Increases each item of a list by 1 (a mapping function).
      *
      * @param alist List[Int]
      * @return List[Int]
      */
    def incrs(alist: List[Int]): List[Int] = {
        alist match {
            case Nil => Nil
            case h :: t => h + 1 :: incrs(t)
        }
    }

    /**
      * Converts a list of strings into a list of the length of
      * each string (a mapping function).
      *
      * @param alist List[String]
      * @return List[Int]
      */
    def lengths(alist: List[String]): List[Int] = {
        alist match {
            case Nil => Nil
            case h :: t => h.length :: lengths(t)
        }
    }

    def doMap[A, B](f : A => B, ls: List[A]): List[B] = {
        ls match {
            case Nil => Nil
            case h :: t => f(h) :: doMap[A, B](f, t)
        }
    }
}
