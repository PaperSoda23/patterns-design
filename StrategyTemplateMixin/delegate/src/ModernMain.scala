import modern.{Bear, Seagull}

object ModernMain extends App {
  println("hello world")
  val seagul = new Seagull
  val bear = new Bear
  seagul.fly(20)
  bear.run(40)
}
