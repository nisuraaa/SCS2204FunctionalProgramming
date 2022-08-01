import scala.io.StdIn.readInt

object q2{
    def main(args: Array[String]) ={
    val a = readInt()             
    a match
    case a: Int if a <= 0 => println("Negative/Zero")
    case a: Int if a % 2==0 => println("Even")
    case a: Int if a % 2!=0 => println("Odd")

    }

}