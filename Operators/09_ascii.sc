import scala.io.StdIn.readChar

@main def ascii() =
  print("Enter the character : ")
  val ch = readChar()
  println(s"ASCII value ${ch} is ${ch.toInt}")