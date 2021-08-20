class Account(id:String, n:Int, b:Double) {
  val nic: String = id
  val acnumber: Int = n
  var balance: Double = b

  override def toString: String = "[" + nic + ":" + acnumber + ":" + balance + "]"

  def transfer(a: Account, b: Double) = {
    this.balance = this.balance - b
    a.balance = a.balance + b
  }

}
