import math.Pi
import math.pow

object Q2 extends App{
  def volume(r:Double):Double=4/3*Pi*pow(r,3)
  println(volume(5))
}
