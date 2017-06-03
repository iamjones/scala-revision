package additionalquestions

object Question20 extends App {

    println("Which GOF patterns are classified as “creational”? Name them.")

    println("Factory, Abstract Factory, Singleton, Builder")

    println("What problem does the Singleton Pattern solve and how?")

    println("Ensures a class can only have one instance by providing a class that controls the" +
        "instantiation and passes back the already instantiated class if it exists.")

    println("Outline the interface of the Singleton Pattern, either in pseudo-code using an" +
        "example, or by using the structure of the pattern, as you prefer.")

    object SingletonGetter {

        val singletonClass = new SingletonClass()

        /**
          * Returns the instance of our singleton class.
          * @return SingletonClass
          */
        def giveMeTheClass(): SingletonClass = {
            singletonClass
        }
    }

    class SingletonClass()
}