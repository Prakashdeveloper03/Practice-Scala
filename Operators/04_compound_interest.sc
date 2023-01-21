import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble

@main def compoundInterest() =
  print("Enter the principal amount : ")
  val principle_amt = readDouble()
  print("Enter the time period in years : ")
  val time_period = readInt()
  print("Enter the rate of interest : ")
  val rate_of_interest = readDouble()
  val compound_interest = principle_amt * Math.pow(
    (1 + rate_of_interest / 100),
    time_period
  ) - principle_amt
  println(
    f"Compound Interest is ${compound_interest}%.2f"
  )
