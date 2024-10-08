package day4

object HigherOrderFn extends App {
  // MAP: The map function transforms (or maps) each element of a collection by applying a function to it.
  // It creates a new collection with the results.
  val numbers = List(1, 2, 3, 4, 5)
  val doubled = numbers.map(x => x * 2)
  println(doubled)


  // FLATMAP: The flatMap function is similar to map, but it also flattens the result.
  // This means it takes a collection of collections and merges them into a single collection.
  val numList = List(1, 2, 3)
  val flatList = numList.flatMap(x => List(x, x * 2))
  // The function passed to flatMap generates a new list for each element in the original list.
  // For example, for 1, it creates a list [1, 2].
  println(flatList)


  // REDUCE: The reduce function combines the elements of a collection using a specified binary operation.
  // It aggregates the collection to a single value.
  val nos = List(2, 3, 4, 5)
  val sum = nos.reduce((a, b) => a + b)
  println(sum)


  // FILTER: The filter function selects elements from a collection that satisfy a given condition (i.e., for which the predicate returns true)
  val nums = List(4, 5, 6, 8, 9)
  val evenNums = nums.filter(x => x % 2 == 0)
  println(evenNums)
}
