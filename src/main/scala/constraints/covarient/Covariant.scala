package main.scala.constraints.covarient

/**
  * Created by davidjones on 29/05/2017.
  */
object Covariant {

    def main(args : Array[String]): Unit = {
        println("-------- Covariant --------")

        val myList = MyList(new Dog())
        println(myList.toString)

        val myListAnimal = MyList(new Animal())
        println(myListAnimal.toString)

        // Our MyList class can take any extension of Animal
        // including Animal itself
    }
}

class Animal
class Dog extends Animal
case class MyList[+T](elements: T)