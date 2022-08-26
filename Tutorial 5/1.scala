object q1{
    def main(Args: Array[String]) = {
            if(checkPrime(97,2)){
                println("Prime")
            }
            else{
                println("Not a Prime")
            }
    }
    def checkPrime(num1 : Int, index : Int): Boolean = {
        num1 match{
            case num1 if(num1==2) => return true
            case num1 if(num1 % index == 0) => return false
                
            case num1 if(index * index > num1) => return true
            case _ => return checkPrime(num1, index+1)
        }

    }
}