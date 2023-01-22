import scala.io.StdIn.readInt

def isPrime(n: Int): Boolean = !((2 until n - 1) exists (n % _ == 0))

@main def checkPrime() =
  print("Enter the number : ")
  val num = readInt()
  if isPrime(num) then
    println(s"${num} is a prime number.")
  else
    println(s"${num} is not a prime number.")