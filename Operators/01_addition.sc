import scala.io.StdIn.readInt

@main def addition() =
  print("Enter the number 1 : ")
  val n1 = readInt()
  print("Enter the number 2 : ")
  val n2 = readInt()
  val n3 = n1 + n2
  println(s"$n1 + $n2 = ${n1 + n2}")