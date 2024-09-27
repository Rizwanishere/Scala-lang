package day1

object Classes extends App {
//Class: Classes in Scala are blueprints for creating objects.
  // They can contain methods, values, variables, types, objects, traits, and classes which are collectively called members
  // A minimal class definition is simply the keyword class and an identifier
  class Point(var x: Int, var y: Int) {

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }

    override def toString: String =
      s"($x, $y)"
  }

  val point1 = new Point(2, 3)
  println(point1.x) // prints 2
  println(point1) // prints (2, 3)
  point1.move(2,2)
  println(point1) // prints (2, 3)


//Constructors: is a special function in a class that is used to create and initialize objects (instances) of that class
  class Pointer(var x: Int = 0, var y: Int = 0) {
    // Overriding toString to customize the string output of Pointer objects
    override def toString: String = s"($x, $y)"
  }
  val origin = new Pointer //x and y are both set to 0
  val pointer1 = new Pointer(1) // x is set to 1 and y is set to 0
  println(pointer1) // prints (1, 0)
  val pointer2 = new Pointer(y = 3)
  println(pointer2) // prints (0, 3)


//Private Members and Getter/Setter Syntax: Members are public by default. Use the private access modifier to hide them from outside of the class.
  class PrivatePointer {
    private var _x = 0
    private var _y = 0
    private val bound = 100

    def x: Int = _x
    def x_=(newValue: Int): Unit = {
      if(newValue < bound)
        _x = newValue
      else
        printWarning()
    }

    def y: Int = _y
    def y_=(newValue: Int): Unit = {
      if(newValue < bound)
        _y = newValue
      else
        printWarning()
    }

    private def printWarning(): Unit =
      println("WARNING: Out of Bounds")
  }

  val pp1 = new PrivatePointer
  pp1.x = 99
  pp1.x = 101 //prints the warning
  //In this version of the Point class, the data is stored in private variables _x and _y.
  // There are methods def x and def y for accessing the private data. def x_= and
  // def y_= are for validating and setting the value of _x and _y.

//Primary constructor parameters with val and var are public. However, because val's are immutable,
  class PrmCons(val x: Int, val y:Int)
  val pc1 = new PrmCons(1, 2)
  println(pc1.x) // 1
  println(pc1.y) // 2
  //pc1.x = 3 //reassignment to val so it does not compile

//Parameters without val or var are private values, visible only within the class.
  class PrmCons1(x: Int, y:Int)
  val pc2 = new PrmCons1(1, 2)
  //println(pc2.x) //does not compile as x & y arent visible to pc2

}
