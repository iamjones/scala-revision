package additionalquestions

object Question6 extends App {

    println("Create an anonymous function with three arguments ( temperate, low, and high).\n" +
        "The anonymous function will return true if the temperature is between high and\n" +
        "low, and false otherwise. Assign the anonymous function to a def and then call your function.")

    def isHighOrLow = (temp : Int, low : Int, high : Int) =>
        temp < high && temp > low

    assert(isHighOrLow(70, 60, 90), "Result should be true")
    assert(!isHighOrLow(70, 80, 90), "Result should be false")
}
