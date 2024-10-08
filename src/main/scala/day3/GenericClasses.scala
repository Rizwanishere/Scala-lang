package day3

object GenericClasses extends App {
  class Box[T](value: T) {
    def getValue: T = value
  }

  val intBox = new Box[Int](10)
  val stringBox = new Box[String]("Hello")

  println(intBox.getValue) // 10
  println(stringBox.getValue) // Hello
}
