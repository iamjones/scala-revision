package main.scala.boundedquantification

object BoundedQuantification {

    def main(args : Array[String]): Unit = {
        println("--- Bounded Quantification ---")

        val persons = List(Person("Dave"), Person("Bruce"), Person("Peter"))

        println(sort(persons))
        println(insert(Person("Adam"), sort(persons)))

        val movies = List(Movie(2001), Movie(1999), Movie(1989))

        println(sort(movies))
        println(insert(Movie(1998), sort(movies)))
    }

    // We use a generic type so this method can be used with multiple types
    def insert[A <: Comparable[A]](x: A, alist : List[A]): List[A] = {
        alist match {
            case Nil => List(x)
            case head :: tail => if (x.lessThan(head)) {
                x :: head :: tail
            } else {
                head :: insert(x, tail)
            }
        }
    }

    // We use a generic type so this method can be used with multiple types
    def sort[A <: Comparable[A]](alist : List[A]): List[A] = {
        alist match {
            case Nil => Nil
            case head :: tail => insert(head, sort(tail))
        }
    }
}

/**
  * @tparam T Generic type
  */
trait Comparable[T] {
    def lessThan (other : T): Boolean
}

case class Person(name: String) extends Comparable[Person] {

    /**
      * Returns whether a persons name is less than the name of
      * the person passed in.
      *
      * @param other Person
      * @return Boolean
      */
    override def lessThan(other: Person) = {
        this.name < other.name
    }
}

case class Movie(releaseYear : Int) extends Comparable[Movie] {

    override def lessThan(other: Movie): Boolean = {
        this.releaseYear < other.releaseYear
    }
}