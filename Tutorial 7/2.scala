object q2 {
  class Rational(x: Int, y: Int) {
    var p = x;
    var q = y

  }

  def sub(a: Rational, b: Rational): Rational = {
    val np = a.p * b.q - b.p * a.q
    val nq = a.q * b.q

    val s = new Rational(np, nq)
    return s
  }

  def main(args: Array[String]) = {
    val n1 = new Rational(3, 4)
    val n2 = new Rational(5, 8)
    val n3 = new Rational(2, 7)

    val d1 = sub(n1, n2)
    val d2 = sub(d1, n3)

    println(d2.p + "/" + d2.q)

  }
}
