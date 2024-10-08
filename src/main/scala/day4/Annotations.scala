package day4

import scala.annotation.tailrec

object Annotations extends App {

  @deprecated("Use newMethod instead", "2.0")
  def oldMethod(): Unit = {
    println("This method is deprecated")
  }

  @tailrec
  def sum(n: Int, acc: Int = 0): Int = {
    if (n == 0) acc
    else sum(n - 1, acc + n)
  }

  println(sum(5)) // Example usage of @tailrec
  oldMethod() // Compiler warning: method is deprecated

}
