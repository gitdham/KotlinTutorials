fun main() {
  val myRect = Rectangle(4.0, 7.0)
  println("Rectangle area is ${myRect.area()}")
  println("Rectangle perimeter is ${myRect.perimeter()}")
  println("Is rectangle a square? ${myRect.isSquare()}")

  val myCircle1 = Circle(5.0)
  val myCircle2 = Circle(7.0)

  val myTriangle = Triangle(3.0, 5.0, 6.0)
}