package additionalquestions

object Question2 extends App {

    println("Define a class SimpleTime that takes two arguments: an Int that represents hours,\n" +
        "and an Int that represents minutes. Use named arguments to create a SimpleTime object.")

    case class SimpleTime(hours : Int, minutes : Int)

    val time = SimpleTime(5, 30)

    assert(time.hours == 5, "Hours does not equal 5")
    assert(time.minutes == 30, "Minutes does not equal 30")
}
