object Q5 extends App{
  def sume(n:Int):Int = {
    if(n%2==0)
    {
      if(n==2)
        0

      else
        sume(n-2)+n-2
    }
    else
      sume(n+1)
  }
}