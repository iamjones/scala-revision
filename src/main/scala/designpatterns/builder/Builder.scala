package main.scala.designpatterns.abstractfactory

object Builder {

    def main(args: Array[String]) {
        println("--- Builder ---")

        val director = new VehicleBuilderDirector
        val carBuilder = new CarBuilder
        val vanBuilder = new VanBuilder

        println("Build car")
        director.build(carBuilder)

        println("\nBuild van")
        director.build(vanBuilder)
    }
}

trait VehicleBuilder {
    def buildWeight()
    def buildNoOfDoors()
    def buildMilePerGallon()
}

trait BuilderDirector

class CarBuilder extends VehicleBuilder {

    def buildWeight(): Unit = {
        println("Weight: 500kg")
    }
    def buildNoOfDoors(): Unit = {
        println("No of doors: 3")
    }
    def buildMilePerGallon(): Unit = {
        println("Miles per gallon: 30")
    }
}

class VanBuilder extends VehicleBuilder {

    def buildWeight(): Unit = {
        println("Weight: 1500kg")
    }
    def buildNoOfDoors(): Unit = {
        println("No of doors: 6")
    }
    def buildMilePerGallon(): Unit = {
        println("Miles per gallon: 12")
    }
}

class VehicleBuilderDirector extends BuilderDirector {

     def build(builder : VehicleBuilder): Unit = {
         builder.buildMilePerGallon()
         builder.buildNoOfDoors()
         builder.buildWeight()
     }
}
