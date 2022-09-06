import scala.io.StdIn._

object caesar {

  def main(args: Array[String]): Unit = {
    print("Enter String: ")
    val s = readLine()

    print("Enter shift value: ")
    val shift = readInt()

    print("Do you want to (E)encrypt or (D)decrypt?: ")
    val flag = readChar()

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encrypt = (c: Char, key: Int, a: String) =>
      if (c.isLetter == true) {
        a((a.indexOf(c.toUpper) + key) % a.size)
      } else {  
        c //returns empty space
      }

    val decrypt = (c: Char, key: Int, a: String) =>
      if (c.isLetter == true) {
        a((a.indexOf(c.toUpper) - key) % a.size)
      } else {  
        c   //returns space
      }

    val cipher =
      (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) =>
        s.map(
          algo(_, key, a) // encrypt("H",key,a) encrypt("E",key,a)
        )

    if (flag == 'E') {
      println(cipher(encrypt, s, shift, alphabet))
    } else {
      println(cipher(decrypt, s, shift, alphabet))
    }
  }
}
