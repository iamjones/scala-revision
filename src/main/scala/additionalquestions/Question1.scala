package additionalquestions

object Question1 extends App {

    println("Create a method manyTimesString that takes a String and an Int as arguments\n" +
        "and returns the String duplicated that many times.")

    def manyTimeString(str: String, times: Int): String = {

        times match {
            case 1 => str
            case _ => str + manyTimeString(str, times - 1)
        }
    }

    assert(manyTimeString("abc", 3) == "abcabcabc", "abcabcabc does not equal " + manyTimeString("abc", 3))
    assert(manyTimeString("123", 3) == "123123123", "123123123 does not equal" + manyTimeString("123", 3))

}
