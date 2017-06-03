package additionalquestions

object Question30 extends App {

    println("Implement an inheritance hierarchy for the different types of employees at a company." +
        "An abstract base class will represent a generic employee. The three derived classes" +
        "represent the various types of concrete employees: programmers, managers, and interns." +
        "Each class has some fields, a constructor, and a print method.")

    val employees : Array[Employee] = Array(
        new Programmer,
        new Manager,
        new Intern("Dave", 10000, 4)
    )

    println(employees.toString)

    employees.foreach(e => {
        e match {
            case e: Promotable => e.promote()
            case _ =>
        }
    })

    println(employees.toString)
}

trait Promotable {

    def promote(): Unit
}

class Employee {

    protected var name : String = ""
    protected var salary: Double = 0
}

class Programmer extends Employee with Promotable {

    protected def overtime : Double = 0

    override def promote() = {
        salary = salary + (salary * 0.1)
    }
}

class Manager extends Employee with Promotable {

    protected var secretary : String = ""

    override def promote() = {
        salary = salary + (salary * 0.5)
    }
}

class Intern(name: String, salary : Double, months : Int) extends Employee {

    protected var internshipMonths : Int = months
}