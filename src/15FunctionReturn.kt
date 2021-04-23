fun main() {
  val pow = printPows(3, 5)
  println(pow)
  println(multiply(3, 5))

  val myList = listOf(3, 2, 5, 1, 5, 6, 7)
  println("The list looks like the following: $myList")
  println("Search for this number:")
  val input = readLine()?.toInt()
  if(input != null) println("The index of $input is ${indexOf(myList, input)}")
}

fun indexOf(list: List<Int>, value: Int): Int {
  for(i in 0 until list.size - 1) {
    if(list[i] == value) return i
  }
  return -1
}

//oneline function
fun multiply(a: Int, b: Int) = a * b

fun printPows(base: Int, exponent: Int): Int {
  var result = 1
  for(i in 1..exponent) {
    result *= base
  }
  return result
}