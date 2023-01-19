import scala.io.StdIn.readLine

def say_name(first_name: String, last_name: String): Unit =
  println(f"Hello, $first_name%s $last_name%s")

@main def helloworld() =
  print("Enter your firstname : ")
  val first_name = readLine()
  print("Enter your lastname : ")
  val last_name = readLine()
  say_name(first_name, last_name)