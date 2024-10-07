package day2

object MulParaList extends App {
  //Multiple parameter lists allow you to define a function that takes more than one list of parameters.
  //This is also known as currying.
  def add(x: Int)(y: Int): Int = {
    x + y
  }

  println(add(2)(3))  // Output: 5


  //Another ex: Partial Application with Multiple Parameter Lists
  def multiply(a: Int)(b: Int): Int = {
    a * b
  }

  // Partially applying the function
  val multiplyBy2 = multiply(2) _ //_ here means 2nd para to be filled later

  val result1 = multiplyBy2(3) // Output: 6
  val result2 = multiplyBy2(5) // Output: 10

  println(result1)
  println(result2)

}

