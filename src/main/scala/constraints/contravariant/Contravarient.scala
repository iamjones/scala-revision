package main.scala.constraints.contravariant

object Contravarient {

    def main(args : Array[String]) {

        println("--- Contravarient ---")

        val myDog = Dog("Bruce")
        val myCat = Cat("Whiskers")

        def printAnimal(printer : Printer[Cat]): Unit = {
            printer.print(myCat)
        }

        val dogPrinter : Printer[Dog] = new DogPrinter
        val catPrinter : Printer[Cat] = new CatPrinter

        printAnimal(catPrinter)

        // For some reason this doesn't work even though the scala docs said it will :(
//        printAnimal(dogPrinter)
    }
}

abstract class Printer[-A] {
    def print(item : A)
}

class DogPrinter extends Printer[Dog] {
    def print(item : Dog): Unit = {
        println("I'm a dog named " + item.name)
    }
}

class CatPrinter extends Printer[Cat] {
    def print(item : Cat): Unit = {
        println("I'm a cat named " + item.name)
    }
}

case class Dog(name : String)
case class Cat(name : String)