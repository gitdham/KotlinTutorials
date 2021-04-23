fun main() {
  val max = getMax(1, 2, 3, 7, 4, 5, 2, 5, 7, 43, 5, 7, 53, 8, 976, 5)
  println("the maximum is $max")

  val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
  println("The alternating sum is $sum")
}

fun alternatingSum(vararg numbers: Int): Int {
  var sum = 0
  var toggle = true
  for(number in numbers) {
    if(toggle) sum += number
    else sum -= number
    toggle = !toggle
  }
  return sum
}

fun getMax(vararg numbers: Int): Int {
  var max = numbers[0]
  for(number in numbers) {
    if(number > max) max = number
  }
  return max
}