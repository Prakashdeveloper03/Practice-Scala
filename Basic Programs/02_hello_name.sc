import scala.io.StdIn.readLine

def say_name(name: String): Unit =
  println(f"Hello, $name%s")

@main def helloworld() =
  print("Enter your name : ")
  val name = readLine()
  say_name(name)