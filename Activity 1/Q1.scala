object Q1 extends App{
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }
  def prime(p:Int,n:Int=2):Boolean= n match { case x if(x==p) => true
  case x if GCD(p,x)>1 => false
  case x => prime(p,x+1)
  }

}