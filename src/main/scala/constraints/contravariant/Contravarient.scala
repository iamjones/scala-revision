package main.scala.constraints.contravariant

object Contravariant {

    def main(args : Array[String]) {

        println("--- Contravarient ---")

        val myDog = Dog("Bruce")
        val myCat = Cat("Whiskers")

        def printAnimal(printer : Printer[Cat]): Unit = {
            printer.print(myCat)
        }

        val animalPrinter : Printer[Animal] = new AnimalPrinter
        val catPrinter : Printer[Cat] = new CatPrinter

        printAnimal(catPrinter)

        // For some reason this doesn't work even though the scala docs said it will :(
        printAnimal(animalPrinter)
    }
}

abstract class Printer[-A] {
    def print(item : A)
}

class AnimalPrinter extends Printer[Animal] {
    def print(item : Animal): Unit = {
        println("I'm an animal named " + item.name)
    }
}

class CatPrinter extends Printer[Cat] {
    def print(item : Cat): Unit = {
        println("I'm a cat named " + item.name)
    }
}

abstract class Animal {
    def name : String
}
case class Dog(name : String) extends Animal
case class Cat(name : String) extends Animal