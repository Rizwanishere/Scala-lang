package day4

object MapVsFlatMap extends App {
  val words = List("Scala", "rocks")
  val result = words.flatMap(word => word.toList)
  println(result)
  //For each word, the function word.toList is applied, converting each word into a list of characters.
  // For example, "Scala" becomes List('S', 'c', 'a', 'l', 'a').
  //The flatMap combines all these character lists into a single list: List('S', 'c', 'a', 'l', 'a', 'r', 'o', 'c', 'k', 's')

  val resultOfMap = words.map(word => word.toList)
  println(resultOfMap)
  //map results in a list of lists: List(List('S', 'c', 'a', 'l', 'a'), List('r', 'o', 'c', 'k', 's')).
  //flatMap "flattens" this structure and creates a single-level list: List('S', 'c', 'a', 'l', 'a', 'r', 'o', 'c', 'k', 's').

}
