package day2

object PatternMatching extends App {
  //pattern matching is a powerful feature that allows you to match a value against a series of patterns and execute code based on the matching pattern.
  // It’s similar to a switch statement in other languages like Java

  import scala.util.Random

  val x: Int = Random.nextInt(10)

  val result = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "others"
  }

  println(s"x is $x and matched value is $result")


  //Pattern matching with conditions (Guards)
  val number = 15

  number match {
    case x if x < 0 => println("Negative number")
    case x if x > 0 && x <= 10 => println("Between 0 to 10")
    case _ => println("Greater than 10")
  }


  //Pattern matching with case classes
  case class Person(name: String, age: Int)

  val person1 = Person("Sohaib", 21)

  person1 match {
    case Person(name, age) if age < 18 => println(s"$name is a minor")
    case Person(name, age) => println(s"$name is an adult")
  }
}
