package additionalquestions

object Question4 extends App {

    println("Create a class called ClothesWasher with a default constructor and two auxiliary constructors,\n" +
        "one that specifies modelName (as a String) and one that specifies capacity\n" +
        "(as a Double).")

    val mainConstructor = new ClothesWasher("Super Clothes Washer", 100)
    assert(mainConstructor.getModelName() == "Super Clothes Washer", mainConstructor.getModelName() + " not equal to 'Super Clothes Washer'")
    assert(mainConstructor.getCapacity() == 100, mainConstructor.getCapacity() + " not equal to '100'")

    val modelConstructor = new ClothesWasher("Basic Washer")
    assert(modelConstructor.getModelName() == "Basic Washer", modelConstructor.getModelName() + " not equal to 'Basic Washer'")
    assert(modelConstructor.getCapacity() == 75, modelConstructor.getCapacity() + " not equal to '75'")

    val capacityConstructor = new ClothesWasher(50)
    assert(capacityConstructor.getModelName() == "Default", capacityConstructor.getModelName() + " not equal to 'Default'")
    assert(capacityConstructor.getCapacity() == 50, capacityConstructor.getCapacity() + " not equal to '50'")
}

class ClothesWasher(modelName: String, capacity: Double) {

    def this(modelName: String) = {
        this(modelName, 75)
    }

    def this(capacity: Double)  = {
        this("Default", capacity)
    }

    def getModelName() : String = {
        modelName
    }

    def getCapacity() : Double = {
        capacity
    }
}
