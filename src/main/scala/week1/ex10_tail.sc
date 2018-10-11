
// Ex #10
// write a function which computes a factorial
// for a given N
// - using while
// - rewrite using recursion
def factorial(n: Int): Int = ???

// Ex #11
// rewrite sum function to be tail-recursive
import scala.annotation.tailrec
def sumTR(f: Int => Int)(a: Int, b: Int): Int = {
  @tailrec
  def iter(a: Int, result: Int): Int = {
    if (???) ???
    else iter(???, ???)
  }
  iter(???, ???)
}

// Ex #12
// write a tail-recursive version of factorial
// test the speed of it
def factorialTR(n: Int): Int = ???
factorialTR(1000)

