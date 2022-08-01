import scala.io.StdIn.readLine   


object q3{
    def main(args:Array[String])={
        val a = readLine()
        println(toUpper(a))
    }

    def toUpper(text :String) = text.toUpperCase()
    def toLower(text :String) = text.toLowerCase()
}