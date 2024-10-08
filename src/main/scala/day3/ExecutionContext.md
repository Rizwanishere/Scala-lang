# Execution Context in Scala

In Scala, an **execution context** is used to manage and control how `Future`s and other concurrent computations are executed. It's essentially a thread pool that executes asynchronous tasks. Whenever a `Future` is created, it needs an `ExecutionContext` to determine where the asynchronous computation will run.

## Key Points:
- The **ExecutionContext** determines which thread pool will execute the future's tasks.
- In Scala, the most commonly used execution context is **global**, which is shared and used for lightweight parallel tasks.
- You can also create custom execution contexts if you want to control threading behavior.

---

## Custom ExecutionContext

You can define a custom execution context if the global context is not suitable for your needs (e.g., if you need specific thread behavior).

```scala
import java.util.concurrent.Executors
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Success, Failure}

// Create a thread pool with 2 threads
val threadPool = Executors.newFixedThreadPool(2) // 2 is no. of threads
implicit val customExecutionContext: ExecutionContext = ExecutionContext.fromExecutor(threadPool)

// Define an asynchronous task
def customTask(): Future[Int] = Future {
  println(s"Running on thread: ${Thread.currentThread().getName}")
  Thread.sleep(1000)
  100
}

// Running the task in the custom execution context
val futureResult = customTask()

// Handle the result
futureResult.onComplete {
  case Success(result) => println(s"Result: $result")
  case Failure(e) => println(s"Failed with error: ${e.getMessage}")
}

Thread.sleep(2000) // Keep the main thread alive long enough for the task to complete
threadPool.shutdown() // Shut down the thread pool after tasks are done
```
## When to Use a Custom ExecutionContext:
**Long-running tasks:** The global execution context is designed for short, non-blocking tasks. For CPU-heavy or blocking I/O operations, a custom execution context is preferred.

**More control:** You can control the number of threads, priorities, and other threading behavior by creating a custom execution context.