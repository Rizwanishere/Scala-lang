package day3

object RegexPattern extends App {

  import scala.util.matching.Regex

  // Define a string to search
  val str = "Scala is fun, and learning Scala is easy!"

  // Define a regular expression pattern
  val pattern: Regex = "Scala".r

  // Check if the pattern exists in the string
  val result = pattern.findFirstIn(str)
  println(result) // Some(Scala)

  result match {
    case Some(matched) => println(s"Found a match: $matched")
    case None => println("No match found")
  }


}
