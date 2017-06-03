package additionalquestions

object Question23 extends App {

    println("Discuss what you understand by the following statement:" +
        "" +
        "“When designing an object-oriented application, a major tenet of design is loose coupling”")

    println("Classes should be responsible for instantiating their dependencies. It makes its harder" +
        "to change and unit test.")

    println("How does dependency injection assist with loose coupling? Provide appropriate" +
        "examples to illustrate your answer.")

    println("A classes dependencies should be injected into the class so they can be changed at run time." +
        "For example a class might need access to a data store. One feature of the site might need to access" +
        "a MySQL database whereas another might need to access a Redis cache. If a Data Access Object that implements" +
        "a common interface is injected into the class it can be changed at run time with minimal effort.")
}
