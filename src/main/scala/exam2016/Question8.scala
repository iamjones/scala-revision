package exam2016

object Question8 extends App {

    println("Write a function allExceptOption, which takes a string and a list of strings as its formal parameters. " +
        "Return None if the string is not in the list, else return Some lst where lst is identical to the " +
        "argument list except the string is not present. You may assume the string is in the list at most " +
        "once. You must not use any higher order functions, e.g., filter.")

    println(allExceptOption("item", List("fred", "knife", "butter")))
    println(allExceptOption("knife", List("fred", "knife", "butter")))

    def allExceptOption(s: String, ls: List[String]): Result = {

        def processList(s: String, ls: List[String], seen: List[String]): Result = {
            ls match {
                case Nil => None()
                case hd :: tl =>
                    if (hd == s) {
                        Some(seen ::: tl)
                    } else {
                        println(hd)
                        processList(s, tl, hd :: seen)
                    }
            }
        }

        processList(s, ls, List())

    }

    trait Result
    case class None() extends Result
    case class Some(ls: List[String]) extends Result
}
