package additionalquestions

object Question5 extends App{

    println("Create a case class to represent a Person in an address book, complete with Strings" +
        "\nfor the name and a String for contact information")

    val me = Person("Dave", "Jones", "dave@jones.com")

    assert(me.firstname == "Dave", me.firstname + "is not equal to 'Dave'")
    assert(me.lastname == "Jones", me.lastname + "is not equal to 'Jones'")
    assert(me.email == "dave@jones.com", me.firstname + "is not equal to 'dave@jones.com'")
}

case class Person(firstname: String, lastname: String, email : String)