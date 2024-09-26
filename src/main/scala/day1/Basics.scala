package day1

object Basics extends App {

//Expressions: expressions are computable statements
  println(1) // 1
  println(1 + 1) // 2
  println("Hello") // Hello!
  println("Hello"+" world") // Hello world


//Values: assigned using val keyword and are immutable
  val x = 2 + 4
  println(x)  //Named results, such as x here, are called values, Values cannot be re-assigned
//The type of a value can be omitted and inferred, or it can be explicitly stated
  val y: Int = 3 + 5
  println(y)


//Variables: assigned using var keyword and are mutable
  var a = 1 + 1
  a = 4 //variables can be re-assigned
  println(a) // 4


//Blocks: You can combine expressions by surrounding them with {}
  println({
    val block = 2 + 2
    block + 2
  }) // 6

//Functions: Functions are expressions that have parameters, and take arguments.
//You can define an anonymous function (i.e., a function that has no name) that returns a given integer plus one
  (p: Int) => p + 1
  // On the left of => is a list of parameters. On the right is an expression involving the parameters
//You can also name functions:
  val addOne = (x: Int) => x + 1
  println(addOne(1)) //2
//A function can have multiple parameters:
  val add = (x: Int, y: Int) => x + y
  println(add(2,3))
//Or it can have no parameters at all:
  val getTheAnswer = () => 99
  println(getTheAnswer())


//Methods: Methods look and behave very similar to functions, but there are a few key differences between them.
//Methods are defined with the def keyword. def is followed by a name, parameter list(s), a return type, and a body:
  def addition(x: Int, y: Int): Int = x + y
  println(addition(3,9)) //12
//A method can take multiple parameter lists:
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(addThenMultiply(2,2)(2)) //8\
//Or no parameter lists at all:
  def name: String = System.getProperty("user.name")
  println("Hello, " + name) //Hello, rizwa\
//you can think of methods as something similar to functions.
//Methods can have multi-line expressions as well:
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(2.5)) //6.25
//The last expression in the body is the method’s return value. (Scala does have a return keyword, but it is rarely used)


//Classes: blueprint for creating objects with fields (state) and methods (behavior)
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = println(prefix + name + suffix)
  }

  val g1 = new Greeter("Hello ", "!")
  g1.greet("Rizwan")


//Case Classes: Scala has a special type of class called a “case” class.
 //You can define case classes with the case class keyword
  case class Point(x: Int, y: Int)

  //You can instantiate case classes without the new keyword
  val point = Point(1, 2)
  val anotherPoint = Point(1, 2)
  val yetAnotherPoint = (2, 2)
  //Instances of case classes are compared by value, not by reference
  if (point == anotherPoint) {
    println(s"$point and $anotherPoint are the same")
  } else {
    println(s"$point and $anotherPoint are different")
  } //Point(1,2) and Point(1,2) are the same
  if (point == yetAnotherPoint) {
    println(s"$point and $yetAnotherPoint are the same")
  } else {
    println(s"$point and $yetAnotherPoint are different")
  } //Point(1,2) and (2,2) are different


//Object: Objects are single instances of their own definitions. You can think of them as singletons of their own classes
  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }
  //You can access an object by referring to its name
  val newId: Int = IdFactory.create()
  println(newId) //1
  val newerId: Int = IdFactory.create()
  println(newerId) //2


//Traits: Traits are abstract data types containing certain fields and methods.
  // In Scala inheritance, a class can only extend one other class, but it can extend multiple traits.
  trait Greeting {
    def greet(): Unit = println("Hello")
  }

  trait Farewell {
    def sayGoodbye(): Unit = println("Goodbye")
  }

  class Person extends Greeting with Farewell

  val p1 = new Person
  p1.greet() // Output: Hello
  p1.sayGoodbye() // Output: Goodbye
}
