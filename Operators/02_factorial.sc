import scala.io.StdIn.readInt

def factorial(num: Int): Int =
  if num < 0 then
    return -1
  else if num == 0 then
    return 1
  else
    return num * factorial(num - 1)

@main def main() =
  print("Enter the number : ")
  val num = readInt()
  println(s"Factorial of $num is ${factorial(num)}")
