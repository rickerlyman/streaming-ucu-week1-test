# Week1: Rationals

### Rationals
Create new project (File, New, Scala|sbt, \<name>, Finish). Create package and create object Rationals, or copy-paste from this repo.
Go through exercises you can find in Rationals.scala.

### Eval
The last topic of friday class we were late to go through - case classes.
So this is going to be a small part of this homework :).
You can learn about basics from [here](https://www.artima.com/pins1ed/case-classes-and-pattern-matching.html).
Case classes are just like regular classes but with ability to be pattern-matched, they also contain implicit equals, hashcode, companion object with apply and unapply.
They are also a usual way to describe business domain of your application - e.g. things like User, Account, etc are modelled using case classes in Scala. And, btw Tuples are case classes too!

In this next task you should implement `eval` function which can evaluate arbitrary expression built with case class hierarchy defined. Go to Eval.scala for details.

### Testing
Add [ScalaTest](http://www.scalatest.org/) library as a dependency in sbt. ScalaTest is Unit-testing framework.
Write simple unit test testing `eval` functionality
Run unit test from within sbt using console. Run unit test from withing IDEA.

### Running
Create Scala console application which evaluates expression given in example (18/27-1/2).
Create run configuration from within IDEA, run it. Run it using sbt directly through terminal.
Package jar artifact and create sh/bat script to run program using `scala` utility

### Submitting the result
The result should be a zip archive containing the project with code and runnable script submitted to grading system.

### Advanced topic (Optional/Bonus)
Write parser for a given Rational expression from arbitrary string.
Learn about parser combinators from [here](https://www.artima.com/pins1ed/combinator-parsing.html).
Program should supply string from command line arguments.


