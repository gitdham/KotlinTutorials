fun main() {
  val age = readLine()?.toInt()
  val x = 6

  when(age) {
    in 0..5   -> {
      println("You're a young kid")
      println("Another line")
    }
    in 6..17  -> println("You're a teenager")
    //with addidtional condition
    18        -> if(x == 6) println("Finally, you're 18")
    19, 20    -> println("You're a young adult")
    in 21..65 -> println("You're an adult")
    else      -> println("You're really old")
  }
}