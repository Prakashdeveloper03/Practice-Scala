import scala.io.StdIn.readInt

def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

@main def primeIntervel() =
  print("Enter the number : ")
  val num = readInt()
  (1 to num).filter(isPrime).foreach((x: Int) => print(s"${x} "))