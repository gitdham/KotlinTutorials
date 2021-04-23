fun main() {
  //  imutable list
  val imList = listOf(1, 2, 3)

  //  mutable list
  val mutList = mutableListOf(1, 2, 3, 4)
  println(mutList)
  mutList.add(5)
  println(mutList)
  mutList.remove(2)
  println(mutList)
  mutList.removeAt(0)
  println(mutList)

  //  val list = mutableListOf<Int>()
  //  for(i in 1..10) {
  //    val x = readLine()?.toInt()
  //    if(x != null) list.add(x)
  //  }
  //  println(list)

  /*Homework 1
  * input 5 numbers and return in reverse order*/
  val list1 = mutableListOf<Int>()
  for(i in 1..5) {
    val x = readLine()?.toInt()
    if(x != null) list1.add(x)
  }

  for(i in list1.reversed()) {
    println(i)
  }

  /*Homework 2
  * input n > 1 and return fibonaci*/
  val list2 = mutableListOf(0,1)
  println("Enter a number n > 1:")
  val n = readLine()?.toInt()
  if(n != null) {
    for(i in 2..n - 1) {
      list2.add(list2[i - 2] + list2[i - 1])
    }
  }
  println(list2)
}