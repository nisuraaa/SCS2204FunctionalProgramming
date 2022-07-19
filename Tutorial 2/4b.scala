object q4b{

    def attendees(price : Int) : Int = return(120 + ( 15  - price) / 5 * 20)

    def revenue(price : Int) :Int =  return(attendees(price) * price)

    def cost(price : Int): Int = return(500 + 3 * attendees(price))

    def profit(price : Int) : Int = return(revenue(price) - cost(price))

    def main(args :Array[String]) = {
        println(profit(40))
        println(profit(30))
    }
}