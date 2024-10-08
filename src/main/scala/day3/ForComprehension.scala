package day3

object ForComprehension extends App {
  //For comprehensions in Scala provide a powerful and readable way to iterate, filter, and transform collections
  //Syntactic sugars for map, flatmap, filter and forEach(more readable)
  val numbers = List(1, 2, 3, 4, 5)

  val doubledEvenNumbers = for {
    num <- numbers // Iterate over the list
    if num % 2 == 0 // Filter even numbers
  } yield num * 2 // Transform the even numbers by multiplying them by 2

  println(doubledEvenNumbers) // Output: List(4, 8)


  //Another example:
  case class User(name: String, age: Int)

  val userBase = List(
    User("Rizwan", 21),
    User("Samad", 21),
    User("Faisal", 22),
    User("Zain", 19)
  )

  val twenties =
    for (user <- userBase if user.age > 20 && user.age < 30) yield user.name


  println(twenties)
  twenties.foreach(println)
}
