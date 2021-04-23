fun main() {
//  printThreelines()
//  printPow(3,5)
  sumValuesFromTo(1,5)
}

fun sumValuesFromTo(num1: Int, num2: Int){
  var result = 0
  for(i in num1..num2){
    result += i
  }
  println("The sum of the values from $num1 to $num2 is $result")
}

fun printPow(base: Int, exponent: Int){
  var result = 1
  for(i in 1..exponent){
    result *= base
  }
  println("$base to the power of $exponent is $result")
}

fun printThreelines(){
  println("first")
  println("second")
  println("third")
}