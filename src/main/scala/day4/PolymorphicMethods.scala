package day4

object PolymorphicMethods extends App {
  // polymorphic methods are methods that can operate on arguments of different types.
  // These methods use type parameters to allow for a greater level of abstraction and flexibility.
  // Type parameters are defined using square brackets [], allowing the method to handle different types dynamically.

  def makePair[A, B](first: A, second: B): (A, B) = { // [A,B] are type paras, (A,B) is a tuple(return value)
    (first, second)
  }

  val intPair = makePair(1, 2)
  val stringPair = makePair("Hello", "World")
  val mixedPair = makePair(42, "Scala")

  println(intPair)
  println(stringPair)
  println(mixedPair)
}
