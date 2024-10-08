package day4

object ByNameParams extends App {
  // By-name parameters are a feature in Scala that allows a function parameter to be evaluated every time it is used,
  // rather than when the function is called. This is different from by-value parameters,
  // which are evaluated once at the time of function invocation.
  def printIfTrue(condition: => Boolean): Unit = {
    if (condition) {
      println("Condition is true")
    } else {
      println("Condition is false")
    }
  }

  // The condition is only evaluated when used inside the function
  printIfTrue(5 > 3) // Output: Condition is true

}
