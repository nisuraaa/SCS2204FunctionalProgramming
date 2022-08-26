object q6{
    def main(Args: Array[String]) = {
        val n = 10
         for(i <- 1 to n){
            println(fibo(i))
            
            }
    }
    def fibo(n : Int): Int = {
        n match{
            case n if(n<=1) => return(n)
            case _ => return(fibo(n-1)+fibo(n-2))
        }
    }
}