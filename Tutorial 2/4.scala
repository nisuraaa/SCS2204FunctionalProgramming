object q4{

    def wage(hours:Int):Int=return(hours*150)

    def ot(hours:Int):Int=return(hours*75)

    def income(h1:Int,h2:Int):Int=return(wage(h1)+ot(h2))

    def tax(income:Int):Double=return(income*.1)

    def takeHome(h1:Int,h2:Int):Double= return(income(h1,h2)-tax(income(h1,h2)))

    def main(args : Array[String]) = {
        println(takeHome(40,30))
    }

}