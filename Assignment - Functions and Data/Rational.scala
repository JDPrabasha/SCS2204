class Rational(x: Int, y: Int) {
  def numer: Int = x
  def denom: Int = y

  def -(r: Rational) = new Rational(this.numer*r.denom - r.numer*this.denom, this.denom*r.denom)

  override def toString: String = numer + "/" + denom
}