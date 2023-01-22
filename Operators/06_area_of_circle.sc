import scala.math.pow
import scala.io.StdIn.readInt

@main def circleArea() =
  print("Enter the radius : ")
  val radius = readInt()
  println(s"Area of the circle is ${Math.PI * (pow(radius, 2))}")