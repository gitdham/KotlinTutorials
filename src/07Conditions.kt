fun main() {
  val x = 7
  val y = 8
  val z = if(x + y == 14) 3 else 4

  if(x < y) {
    println("x is lesser than y")
  } else if(x > y) {
    println("x is greater than y")
  } else {
    println("x is equal to y")
  }
  println("this will always executed")

  println("the value of z is $z")

  /*  Homework
      Create string palindrome checker
      ex: The string is racecar
      output: The string racecar is a palindrome
   */

  val string = "boxtobox"
  if(string === string.reversed()) return println("The string $string is a palindrome")
  println("The string $string is not a palindrome")
}