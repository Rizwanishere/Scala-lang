package day2

object CaseClasses extends App {
  //Case classes are a special type of class that come with additional functionality compared to regular classes.
  //They are primarily used for creating immutable data models and are often used in pattern matching.
  case class Message(sender: String, recipient: String, body: String)

  val message1 = Message("hello@gmail.com", "bye@gmail.com", "How are you")

  println(message1)
  println(message1.sender) //hello@gmail.com
  //  message1.sender = hi@gmail.com  // does not compile


  //Comparison: Instances of case classes are compared by structure and not by reference:
  val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  println(message2 == message3) //true


  //Copying: You can create a (shallow) copy of an instance of a case class simply by using the copy method.
  val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
  val message5 = message4.copy(recipient = "helloooo@gmail.com") // optionally change constr args
  println(message5.sender) // julien@bretagne.fr
  println(message5.recipient) // helloooo@gmail.com
  println(message5.body) // Me zo o komz gant ma amezeg

}
