import modern.{Bear, Seagull}

object ModernMain extends App {
  val seagul = new Seagull
  val bear = new Bear
  println("seagul")
  seagul.fly(20)
  seagul.eat()
  seagul.makeLove()
  println("\n")
  println("bear")
  bear.run(40)
  bear.sleep()
  bear.eat()
}
