package week1

class Rational(n: Int, d: Int){
  val num: Int = n
  val den: Int = d
  def isNull: Boolean = num == 0

}

//  Ex: Complete the Rational class with an add(r:Rational):Rational
//  function.

//  Ex: Redefine the toString method of the Rational class.

//  Ex: Redefine equals method of the Rational class.

//  Ex: Add sub, div, mul methods

//  Ex: Make sure that rational numbers that are created are optimized e.g. 6/12 is optimized into 1/2.
//      Hint: use gcd function we've seen in lectures.

//  Ex: Define toDouble method to return real approximate value of the number.

//  Ex: Operators: <, >, ==, /, *, +, -. Glance through https://docs.scala-lang.org/tour/operators.html.
//      Remember you can operate with functions as values to define an 'alias' operators for already defined methods.
//      To get a function value from a method, you can use '_' syntax, e.g. `isNull _`

//  Ex (Optional): Define companion object Rational with apply as alternative constructor for rationals.

//  Ex: Write a few tests using ScalaTest framework covering basic use cases.

object Rationals extends App {
  println(new Rational(1, 2))
}
