fun main() {
  val myArray = arrayOf("hello", "guys", "what's up?")
  val arrLength = myArray.size
  var i = 0

  while(i < arrLength) {
    println(myArray[i])
    i++
  }

  /*Homework 1
  * input: "enter a number: " (int)
  * output: "Lets count from 'number' down to 0: "*/

  println("Enter a number: ")
  var num = readLine()?.toInt()

  println("Lets count from $num down to 0:")
  while(num != null && num >= 0) {
    println(num)
    num--
  }

  /*Homework 2
  * input: "enter number 1: " (int)
  * input: "enter number 2: " (int)
  * output: "num1 to the power of num2 is ..."*/

  println("Enter number 1:")
  val num1 = readLine()?.toInt()
  println("Enter number 2:")
  val num2 = readLine()?.toInt()

  var result = 1
  var j = 0
  while((num1 != null && num2 != null) && j < num2) {
    result *= num1
    j++
  }

  println("$num1 to the power of $num2 is $result")
}