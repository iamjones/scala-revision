package additionalquestions

object Question16 extends App {

    println("Briefly describe the Facade design pattern.")

    println("A method that's only responsibility is to execute code to achieve a goal making a more simple interface for the" +
        "applicaiton to use. For example if a banking" +
        "application is to draw money out it will need to check the user is authorised, there is enough money in the account," +
        "and maybe some other stuff. This could all be handled by a single facade method that groups this functionality. ")
}
