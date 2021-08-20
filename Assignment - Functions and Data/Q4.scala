
object Q4 extends App{
//Q4.1
  val overdraft=(b:List[Account])=>
    b.filter(x=>x.balance<0)
//Q4.2
  val bankbalance=(b:List[Account])=> b.map(_.balance).reduce((x,y)=>(x+y))
  //Q4.3
  val interest=(b:List[Account])=>b.map(account=>if(account.balance<0) account.balance=account.balance*1.1 else account.balance=account.balance*1.05)

  var bank=List(new Account("678", 801, 8000), new Account("678", 801, 5000))
  println(bankbalance(bank))
}