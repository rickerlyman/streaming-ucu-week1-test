package week1

class Rational(n: Int, d: Int){
  val num: Int = n // can use var instead
  val den: Int = d // to have mutable objects
  def isNull: Boolean = num == 0
}

//  Ex: Complete the Rational class with an add(r:Rational):Rational
//  function.

//  Ex: Redefine the toString method of the Rational class.


object Rationals extends App {
  println(new Rational(1, 2))
}
