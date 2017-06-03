package additionalquestions

import scala.annotation.tailrec

object Question28 extends App {

    val sudoku = new Sudoku()
    val r = sudoku.checkBlock(Matrix())

    println(s"Result is: $r")
}

class Sudoku {

    def checkBlock(matrix: Matrix): Boolean = {

       @tailrec def checkNumbers(ls : List[Int], seen : List[Int]): Boolean = {

           ls match {
               case Nil => true
               case hd :: tl =>
                   if (seen.contains(hd) || hd > 9 || hd < 1) {
                       false
                   } else {
                       checkNumbers(tl, hd :: seen)
                   }

           }
        }

        // Assuming we can flatten into a single list
        checkNumbers(matrix.get().flatten, List())
    }
}

case class Matrix() {

    def get(): List[List[Int]] = {
        List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    }
}