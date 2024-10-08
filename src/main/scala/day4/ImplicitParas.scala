package day4

object ImplicitParas extends App {
  /*
  implicit parameters are a mechanism that allows parameters to be passed
  automatically by the compiler when they are not explicitly provided in
  the function call. This is useful for dependency injection, type classes,
  and reducing boilerplate code.
  */

  // When you define a function with an implicit parameter, you mark the parameter with the implicit keyword.
  // Defining an implicit value
  implicit val DefaultDiscount: Double = 0.1 // 10 %

  def afterDiscount(price: Double)(implicit discount: Double): Double = {
    price * (1 - discount)
  }

  println(afterDiscount(1000)) // No disc para is passed so it auto(implicitly) takes 0.1 as default from above
  println(afterDiscount(1000)(0.2))

}
