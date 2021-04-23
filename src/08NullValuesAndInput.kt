fun main() {
  //  val userInput = readLine()

  //  println("Hello ${userInput?.toUpperCase()}")

  //  if(userInput !== null) println(userInput.toInt() - 5)

  /*Homework
  * input: "please enter your age: (int)
  * output: if age < 25 "you are not adult"
  *         if age >= 25 "you are an adult" */

  println("Enter your age")
  val age = readLine()
  if(age !== null) {
    if(age.toInt() <= 18) return println("You are not an adult yet")
    if(age.toInt() >= 65) return println("You are really really old")
    println("You are an adult")
  }
}