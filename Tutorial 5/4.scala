object q4{
    def main(Args: Array[String])={
        val n1 = 10
        if(isEven(n1)==1){
            println("Number is even")
        }else{
            println("Number is odd")
        }
    }

    def isEven(n : Int): Int = {
        if(n==0){
            return 1
        }else if(n==1){
            return 0
        }else if(n<0){
            return(isEven(-n))
        }else{
            return(isEven(n-2))
        }
    } 
}