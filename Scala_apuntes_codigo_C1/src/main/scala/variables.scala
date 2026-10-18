object variables {
  def main(args: Array[String]): Unit = {
    val x= 3
    val y = 4
    val z = x+y
    //Hacer x=y+1 da error en tiempo de compilación porque x es inmutable
    println(s"La suma es $z")
  }
}
