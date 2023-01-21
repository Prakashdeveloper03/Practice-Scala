import scala.io.StdIn.readInt

@main def simpleInterest() =
  print("Enter the principal amount : ")
  val principle_amt = readInt()
  print("Enter the time period in years : ")
  val time_period = readInt()
  print("Enter the rate of interest : ")
  val rate_of_interest = readInt()
  println(s"Simple Interest is ${(principle_amt * time_period * rate_of_interest) / 100}")
