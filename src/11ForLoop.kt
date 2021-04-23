fun main() {
  //  val myArray = arrayOf(1,2,3)

  //  for(i in 1..3){
  //    println(i)
  //  }

  //  for(i in 3..5){
  //    println(i)
  //  }

  //  for(i in 10 downTo 5){
  //    println(i)
  //  }

  //  for(i in 10 downTo 5 step 2){
  //    println(i)
  //  }

  //  for(i in 'a'..'f'){
  //    println(i)
  //  }

  val myArr = arrayOf(4, 5, 8, 9, 10, 2, 3)
  var max = myArr[0]
  for(i in myArr) {
    if(i > max) max = i
  }
  println(max)

  /*Homework 1
  * sum the array*/
  val arr = arrayOf(3, 2, 5, 1, 3, 5, 54, 23, 45, 54, 214, 56, 123)
  var result = 0
  for(i in arr) {
    result += i
  }
  println(result)

  /*Homework 2
  * enter 5 num and return the average*/
  println("Enter 5 numbers:")
  var avg = 0.0
  for(i in 1..5){
    var input = readLine()?.toInt()
    if(input != null) avg += input/5.0
  }
  println("The average value is $avg")
}