object q5{
    def main(Args: Array[String]) = {
        println(addeven(6))
    }
    def addeven(n : Int): Int = {
           if(n%2==0){
            if(n==0){
                return 0
            }
            else{
                return(n+addeven(n-1))
            }
        }
        else{
            return(addeven(n-1))
        }
    }
}