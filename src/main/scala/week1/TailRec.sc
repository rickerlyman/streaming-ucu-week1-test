
// Ex #10
// write a function which computes a factorial
// for a given N
// - using while
// - rewrite using recursion
def factorial(n: Int): Int = ???

import scala.annotation.tailrec

//@tailrec
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  if (a == b) a else f(a) + sum(f)(a + 1, b)
}

// Ex #11
// rewrite sum function to be tail-recursive
import scala.annotation.tailrec
def sumTR(f: Int => Int)(a: Int, b: Int): Int = {
  @tailrec
  def iter(a: Int, result: Int): Int = {
    if (a > b) result
    else iter(a + 1, result + f(a))
  }
  iter(a, 0)
}

sumTR(_ * 2)(1, 3)

// Ex #12
// write a tail-recursive version of factorial
// test the speed of it
def factorialTR(n: Int): Int = ???
factorialTR(1000)

