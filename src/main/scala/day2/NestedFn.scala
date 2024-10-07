package day2

object NestedFn extends App {
  //Function inside another Fn, Tail recursion example
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }

    fact(x, 1)
  }

  println(factorial(5))

}
