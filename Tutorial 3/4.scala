object q4{
    def main(args: Array[String]) = {
        def matchTest(x: Int): Double = x>50 match
        case true => 24.95 * 0.6 + 50 * 3 + (x-50) * 0.75
        case false => 24.95 * 0.6 + x * 3 
       
        println(matchTest(60))
    }
}