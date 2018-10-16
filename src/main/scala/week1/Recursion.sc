
// Ex #3
// Write a function to sum all integers between two given numbers a and b:
// - use var
// - rewrite using recursion
def sumInts(a: Int, b: Int): Int = {
  if (a==b) {
   a
  }
  a + sumInts(a + 1, b)
}


// Ex #4
// Write a function to sum the squares of all integers
// between two given numbers a and b:
def square(x: Int): Int = x * x
def sumSquares(a: Int, b: Int): Int = sum(square)(a, b)


// Ex #5
// write a common function to сalculate sum of integers from a to b with f applied to each of them
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  if (a == b) a else f(a) + sum(f)(a + 1, b)
}


// Ex #6
// Write previous function in terms of map and reduce,
// converting a,b into a Range
def sum1(f: Int => Int)(a: Int, b: Int): Int = {
  (a to b).map(f).reduce(_ + _)
}