package day1

//Trait for basic animal behaviour
trait Animal {
  def sound(): String // Abstract method
}
//Trait for animals that can fly
trait CanFly {
  def fly(): Unit = println("I can fly") //concrete method
}

//Classes that will use traits
//Bird class mixes in Animal and CanFly traits
class Bird(val name: String) extends Animal with CanFly {
  def sound(): String = "Chirp Chirp" //Implementing abstract method here
}
//Dog class mixes only with animal trait
class Dog(val name: String) extends Animal {
  def sound(): String = "Woof Woof"
}

object Traits extends App {
  val bird = new Bird("Parrot")
  println(s"${bird.name} says ${bird.sound()}") //Parrot say I Chirp Chirp
  bird.fly() //I can fly

  val dog = new Dog("Bulldog")
  println(s"${dog.name} says ${dog.sound()}") //Bulldog says Woof Woof
  //dog.fly() //This would cause an error since Dog cannot fly
}
