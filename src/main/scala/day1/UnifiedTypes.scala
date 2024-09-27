package day1

object UnifiedTypes extends App {
//Scala Types: Any -> AnyVal=double,float,long,short,int,char,boolean,byte,unit && AnyRef=list,traits,classes,obj
  //Here is an example that demonstrates that strings, integers, characters, boolean values, and functions are all of type Any
  val list: List[Any] = List("a string",78,'a',true,() => "anonyFn returning a string")
  list.foreach(ele => println(ele))


//Type casting: converting an instance of one type to another, UpCasting and DownCasting
  val x: Long = 987654321
  val y: Float = x.toFloat
  println(y) //9.8765434E8
  val face: Char = '☺'
  val number: Int = face
  println(face) //☺

//Casting is unidirectional. This will not compile
  val a: Long = 987654321
  val b: Float = a.toFloat
  println(b) //9.8765434E8
//val c: Long = b //Does not conform


//Nothing: is a subtype of all types, also called the bottom type. There is no value that has type Nothing.
  // A common use is to signal non-termination such as a thrown exception, program exit, or an infinite loop


//Null is a subtype of all reference types (i.e. any subtype of AnyRef). It has a single value identified by the keyword literal null.
  // Null is provided mostly for interoperability with other JVM languages and should almost never be used in Scala code

}
