package additionalquestions

object Question25 extends App {

    println("Provide brief definitions of the following terms:")

    println("Object-oriented programming")
    println("Any application that uses a language that support encapsulation, inheritance and polymorphism.")

    println("Object")
    println("An instantiated class")

    println("Class")
    println("A unit that provides some functionality")

    println("Information Hiding")
    println("Encapsulation. Using private properties to make sure other classes can't use them without" +
        "the owner class making them available through encapsulation")

    println("Encapsulation")
    println("Private properties exposed using getters and setters.")

    println("Inheritance")
    println("Once class that extends another will inherit its functionality if there are public / protected" +
        "properties or / and methods")

    println("Polymorphism")
    println("Classes that implement a common interface and be changed at runtime")

    println("Derived class")
    println("A child class that extends a base class")

    println("Interface")
    println("Defines the methods of a class but does not commonly provide implementation for them even though in " +
        "scala and later versions of java implementation can also be provided")

    println("Dependency Injection")
    println("Passing classes into another class. This can be done by using the classes constructor or by autowiring " +
        "them to the properties of the class. Spring implements autowired DI.")

}
