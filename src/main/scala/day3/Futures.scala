package day3

object Futures extends App {
  //  Future represents a value that may not yet be available but will be computed and available at some point in the future.
  //  It’s used for handling asynchronous computations.
  //  When you want to perform tasks without blocking the main thread,
  //  such as fetching data from a database or making a web service call, Future comes in handy.

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success, Failure}
  import scala.concurrent.Await
  import scala.concurrent.duration._

  // Simulate a time-consuming task
  def longRunningTask(): Int = {
    Thread.sleep(3000) // Simulate a 3-second delay
    42 // Return some result after the delay
  }

  // Create a Future that runs the task
  val futureResult: Future[Int] = Future {
    longRunningTask()
  }

  // Handle the result when the Future completes (CallBack)
  futureResult.onComplete {
    case Success(result) => println(s"The result is: $result")
    case Failure(e) => println(s"Failed with error: ${e.getMessage}")
  }

  println("The future is running...") // Program till here will print only this line and not futureResult as main thread finishes its execution before future completes

  // Wait for the future to complete (blocking)
  Await.result(futureResult, 5.seconds)

}
