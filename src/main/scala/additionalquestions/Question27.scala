package additionalquestions

object Question27 extends App {

    println("What is the motivation for using the decorator design pattern?")
    println("Dynamically add functionality to existing methods without altering the original method.")

    println("What is the main problem with the decorator design pattern?")
    println("If methods in the class do not need any extra functionality then they will" +
        "just need to call the method of the class being decorated.")

    println("Which design pattern would you use to augment the decorator design pattern so" +
        "that it supports many configurable ways for “decorating”.")
    println("The strategy pattern.")

    println("Suggest design patterns for creating the augmented decorator and explain how" +
        "you would use them for this purpose.")
    println("I would use the strategy pattern. ")
}
