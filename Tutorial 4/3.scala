import scala.io.StdIn.readLine

object q3 {

  def toUpper(text: String) = text.toUpperCase()
  def toLower(text: String) = text.toLowerCase()
  def formatNames(
      name: String
  )(tdList: Int*)(func: String => String): String = {
    if (tdList.isEmpty) {
      return func(name)
    }
    var str = ""
    var i = 0
    while (i < name.length()) {
      if (tdList.contains(i)) {
        str = str + func(name(i).toString())
      } else {
        str = str + name(i).toString()
      }
      i = i + 1
    }
    return str
  }
  def main(args: Array[String]) = {

    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }
}
