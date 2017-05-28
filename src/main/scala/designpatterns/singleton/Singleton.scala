package main.scala.designpatterns.singleton

object Singleton {

    def main(args: Array[String]) {
        println("--- Singleton ---")

        println(MySingleton.getMyObject)
        println(MySingleton.getMyObject) // Make sure they are the same
    }
}


object MySingleton {

    val myObject = new MySingleton()

    def getMyObject = {
        myObject
    }
}

class MySingleton