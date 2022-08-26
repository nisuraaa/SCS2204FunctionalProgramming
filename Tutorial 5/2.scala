object q1{
    def main(Args: Array[String]) = {
            primeSeq(10)
    }
    def checkPrime(num1 : Int, index : Int): Boolean = {
        num1 match{
            case num1 if(num1==2) => return true
            case num1 if(num1 % index == 0) => return false
                
            case num1 if(index * index > num1) => return true
            case _ => return checkPrime(num1, index+1)
        }
    }

    def primeSeq(n : Int): Unit = {
        for(i <- 2 to n){
            i match{
            case i if(checkPrime(i,2)) => println(i)
            case _ =>
            }
        }
    }
}