val lb=List(1,2,3,4,5)
 /*
 Ex #0
 Using for-loop, build the list of squares of lb*/
???

// Ex #0.1
// Enhance previous by filtering out even squares, leaving only odds
// Enhance previous by println-ing every value


// Ex #1
// Write a function which for a given number
// returns a List of random integers of that length
def randomList(length: Int) = ???


// Ex #2
// Write a function to filter a given list of integers
// using for-comprehension
def filter(
  list: List[Int],
  f: Int => Boolean): List[Int] = ???

val ints = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: 9 :: Nil
val f: Int => Boolean = _ % 2 == 0
assert(filter(ints, f) == List(2,4,6,8))


/*=============================================*/

// Ex #3
// Write a function to sum all integers between two given numbers a and b:
// - use var
// - rewrite using recursion
def sumInts(a: Int, b: Int): Int = ???


// Ex #4
// Write a function to sum the squares of all integers
// between two given numbers a and b:
def square(x: Int): Int = x * x
def sumSquares(a: Int, b: Int): Int = ???


// Ex #5
// write a common function to perform summing
def sum(f: Int => Int)(a: Int, b: Int): Int = ???


// Ex #6
// Write previous function in terms of map and reduce,
// converting a,b into a Range
def sum1(f: Int => Int)(a: Int, b: Int): Int = ???


/*=============================================*/

// Ex #7
// write a function which returns last element
// of a given list of integers, using pattern matching and recursion
def last(l: List[Int]): Int = ???


// Ex #8
// Write a function which returns Nth element
// using pattern matching
// you can use 'assert' to test if input arg is valid
// Re-write previous function using this one and list.length
def nTh(l: List[Int]): Int = ???


// Ex #9
// write a function which computes a median of
// a randomly generated list (reuse function above)
// you can use list.sortWith function to sort a list
def median(l: List[Int]): Int = ???


// Ex. Split a list into two parts.
// The length of the first part is given.  Use a Tuple for your result.
// Example:
// scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
// res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))


// Ex #10
// write a function which computes a factorial
// for a given N
// - using while
// - rewrite using recursion
def factorial(n: Int): Int = ???

/*=============================================*/

// Ex #11
// rewrite sum function to be tail-recursive
import scala.annotation.tailrec
//@tailrec
def sumTR(f: Int => Int)(a: Int, b: Int): Int = {
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


/*=============================================*/

/* Home Assignment
Simple Expression parser
  1 + 2 * 3 = 7
Build an expression evaluator that works on tokens of strings composed of integers and binary operators + and * (see example)
Grammar:
  expression -> number {operator number}*
  operator -> ‘+’ | ‘*’
  number -> regex([0-9]+)

Hints:
  - use pattern matching to match operator:
    case "+" :: tail
  - use .toInt to parse number
    "1".toInt == 1
*/
def eval(l: List[String]): Int = ???

assert(eval(List("1", "+", "2", "*", "3")) == 7)
assert(eval(List("5", "*", "3", "+", "1")) == 16)
