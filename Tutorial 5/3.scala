 object q3{
    def main(Args : Array[String]) ={
        println(sum(5))
    }

    def sum(n : Int): Int = {
        n match{
        case n if(n==1)=>return 1
        case _ => return n + sum(n-1)
        }
    }
 }