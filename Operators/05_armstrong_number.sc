import scala.math.pow
import scala.io.StdIn.readInt

@main def armstrong() =
  print("Enter the number : ")
  val num = readInt()
  if num.toString
      .map(c => pow(c.asDigit, num.toString.length))
      .sum == num
  then println(s"${num} is a armstrong number.")
  else println(s"${num} is not a armstrong number.")