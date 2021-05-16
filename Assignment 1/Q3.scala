
object Q3 extends App{
  def cost(b:Int):Double=if (b > 50) 50*3 + 0.75*(b-50)+ 0.6*24.95*b else (3 + 0.6*24.95)*b
  println(cost(60))
}
