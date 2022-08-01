object q1{
    def main(args: Array[String]) ={
        println(interest(20000))
        println(interest(40000))
        println(interest(2330000))
    }

    def interest(x: Int): Double = 
        if(x <= 20000){
            return x * 0.02;
        }else if(x <= 200000){
            return x * 0.035;
        }else{
            return x * 0.065
        }
}