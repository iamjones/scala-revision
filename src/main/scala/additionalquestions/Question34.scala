package additionalquestions

object Question34 extends App {

    println("You are maintaining a system which is impossible to modify (e.g., a bunch of binary." +
        "class files for which you do not have the source code). The system functions perfectly" +
        "and you do not want to tamper with it. The system accepts several parameters, " +
        "performs a simulation, and returns an image with a graph illustrating the results of" +
        "the simulation." +
        "Your are given the task of designing an extension to the system that preserves the same " +
        "interface as the original system; the extension superimposes a grid on top of the graph output.")

    println(" What design pattern should be applied here?")
    println("Decorator")

    println("Provide a supporting argument for your choice")
    println("The decorator pattern will allow the existing code to remain untouched. It will also allow" +
        "extra functionality to be added 'on top' of the existing functionality. The graph returned from the " +
        "original code can be modified in the decorator to add the grid on top.")
}
