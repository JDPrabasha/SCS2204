import scala.math
case class Point(var x: Int, var y: Int) {

  def +(p:Point)= Point(this.x+ p.x, this.y+p.y)

  def move(dx:Int, dy:Int)={
    this.x=this.x+dx
    this.y=this.y+dy
  }

  def distance(p:Point): Unit ={
    println(math.sqrt(math.pow(p.x-this.x,2)+math.pow(p.y-this.y,2)))
  }

  def invert(): Unit ={
    val t=this.x
    this.x=this.y
    this.y=t
  }
}

object Q1 extends App {
  
  val p1 = Point(9, 2)
  val p2 = Point(8, 2)

  val p3 = p1 + p2
  println(p3)


  p3.move(6, 3)
  println(p3)


  p3.distance(p1)

  p3.invert()
  println(p3)
  
}
