import scala.io.StdIn.readInt
import scala.math.pow

@main def squareSum() =
  print("Enter the number : ")
  val num = readInt()
  println(s"Sum of cubes of first ${num} natural numbers is ${List.range(1, num + 1).map(x => pow(x, 3)).sum}")