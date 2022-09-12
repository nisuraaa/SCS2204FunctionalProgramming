object q3 {
  class Account(x: Int) {
    var balance = x;
    def transfer(payee: Account, value: Int) = {
      if (this.balance < value) {
        println("Not enough money")
      } else {
        this.balance = this.balance - value
        payee.balance = payee.balance + value
        println("Transfer Sucessful")

      }
    }
  }

  def main(args: Array[String]) = {
    var person1 = new Account(5000);
    var person2 = new Account(10);
    person1.transfer(person2, 3000)
    println(person2.balance)
  }

}
