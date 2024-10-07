package day2

object HighOrderFn extends App {
  //Take one or more functions as parameters.
  //Return a function as a result.

  // A simple function that multiplies a number by 3
  def triple(x: Int): Int = x * 3

  // A higher-order function that applies a given function to a number
  def applyFunction(f: Int => Int, value: Int): Int = {
    f(value) // Applies the function 'f' to the given value
  }

  val result = applyFunction(triple, 4) // Applies the 'triple' function to 4
  println(result) // Output: 12

}
