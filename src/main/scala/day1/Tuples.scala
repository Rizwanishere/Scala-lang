package day1

object Tuples extends App {
//Tuples:  is a value that contains a fixed number of elements, each with its own type. Tuples are immutable.
  val ingredient = ("Sugar", 25)
  // Accessing a tuple
  println(ingredient._1) //Sugar
  println(ingredient._2) //25

  //Pattern matching on tuples
  val (name, quantity) = ingredient
  println(name) //Sugar
  println(quantity) //25

  //another eg of pattern matching on tuple
  val planets =
    List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
      ("Mars", 227.9), ("Jupiter", 778.3))
  planets.foreach {
    case("Earth", distance) =>
      println(s"Our planet is $distance million kilometers from the sun")
    case _=>
  }

  //Or, in a for comprehension
  val numPairs = List((2, 5), (3, -7), (20, 56))
  for ((a,b) <- numPairs) {
    println(a * b)
  }

}
