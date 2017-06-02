package additionalquestions

object Question10 extends App {

    println("Which design pattern you would use to assign more functionality to an object without sub-classing it?")

    println("Decorator. You would create a new class using the same interface as the original and inject the original" +
        "class . Any method that needs extra functionality is added with the original class method being called also.")
}
