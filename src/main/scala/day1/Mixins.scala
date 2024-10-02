package day1

// Entry point to run the code
object Mixins extends App {
  // Mixins: mixins are a way to compose behavior in classes by mixing in traits.
  // A trait is a special kind of class that defines methods and fields

  // Trait with a concrete method
  trait Greetable {
    def greet(): Unit = {
      println("Hello") // Concrete method
    }
  }

  // Trait with an abstract method
  trait Nameable {
    def name: String // Abstract method
  }

  // Class Person that extends both traits
  class Person(val name: String) extends Nameable with Greetable

  // Creating an instance of Person and using the methods
  val person = new Person("Rizwan")
  person.greet() // Output: Hello
  println(s"My name is ${person.name}") // Output: My name is Alice
}
