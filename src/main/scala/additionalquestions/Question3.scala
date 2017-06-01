package additionalquestions

object Question3 extends App {

    println("Demonstrate that named and default arguments can be used with methods. Create a" +
        "\nclass Item that takes two class arguments: A String for name and a Double for price." +
        "\nAdd a method cost which has named arguments for grocery (Boolean), medication" +
        "\n(Boolean), and taxRate (Double). Default grocery and medication to false, taxRate" +
        "\nto 0.10." +
        "\nIn this scenario, groceries and medications are not taxable. Return the total cost of" +
        "\nthe item by calculating the appropriate tax.")

    val flour = new Item(name="flour", 4)
    assert(flour.cost(grocery=true) == 4, "Cost should equal 4")

    val sunscreen = new Item(name="sunscreen", 3)
    assert(sunscreen.cost() == 3.3, "Cost should equal 3.3")

    val tv = new Item(name="television", 500)
    assert(tv.cost(rate=0.06) == 530, "Cost should equal 530")

}

class Item(name : String, price: Double) {

    def cost(grocery: Boolean = false, medication: Boolean = false, rate: Double = 0.1): Double = {

        if (grocery || medication) {
            price
        } else {
            price + (price * rate)
        }
    }
}
