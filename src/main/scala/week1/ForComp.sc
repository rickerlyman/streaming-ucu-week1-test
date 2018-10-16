val lb=List(1,2,3,4,5)
/*
Ex #0
Using for-loop, build the list of squares of lb*/
val sqrs: List[Int] = for {
  i <- lb
} yield i*i

// Ex #0.1
// Enhance previous by filtering out even squares, leaving only odds
// Enhance previous by println-ing every value


// Ex #1
// Write a function which for a given number
// returns a List of random integers of that length
def randomList(length: Int): List[Int] = {
  import scala.util.Random.nextInt
  val l = for {
    i <- (1 to length).toList
  } yield nextInt
  l
}

