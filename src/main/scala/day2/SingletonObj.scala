package day2

object SingletonObj extends App {
  // Singleton objects are a way to create a single instance of a class that cannot be instantiated multiple times.
  // They are often used for utility functions or shared resources.
  // Singleton objects are declared using the object keyword and can have members (variables and methods) just like a class.

  object MathUtils {
    def square(x: Int): Int = x * x

    def cube(x: Int): Int = x * x * x
  }

  println(MathUtils.square(5))
  println(MathUtils.cube(5))

  // Companion objects: Singleton object acting as a companion to a class:
  class Person(val name: String, val age: Int)

  object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)

    def greet(person: Person): String = s"Hello ${person.name}"
  }

  val person1 = new Person("Samad", 21)
  println(Person.greet(person1))
}


