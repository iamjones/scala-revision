package additionalquestions

object Question7 extends App {

    println("Use reduce to implement a method sumIt that takes a variable argument list and sums those arguments.")

    def sumIt(ls : Int*) = {
        ls.reduce((a : Int, b: Int) => a + b)
    }

    val sum1 = sumIt(1, 2, 3)
    assert(sum1 == 6, "Sum should equal 6")

    val sum2 = sumIt(45, 45, 45, 60)
    assert(sum2 == 195, "Sum should equal 195")
}
