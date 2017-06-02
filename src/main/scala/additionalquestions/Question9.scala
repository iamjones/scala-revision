package additionalquestions

object Question9 extends App {

    println("Briefly describe how you would refactor a given class into a Singleton?")

    println("If we have a class called A that we want to make a singleton." +
        "We would have another class, class B, that's only responsibility is to instantiate and store" +
        "an instance of A. Any further request to get an instance of A would return the stored instance.")
}
