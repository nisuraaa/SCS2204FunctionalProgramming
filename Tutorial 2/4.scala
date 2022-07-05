def main(args : Array[String]): Unit = {
    println(salary(40,12))
}


def salary(a:Int, b:Int) : Int = {
    var x = a * 250
    var y = b * 85
    var tot = (x + y) * 1.12
    return tot;
}