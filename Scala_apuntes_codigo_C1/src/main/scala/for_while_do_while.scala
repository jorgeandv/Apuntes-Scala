import scala.io.StdIn
object for_while_do_while {
  def contador(n: Int): Unit = {
    var contador = n  //Necesitamos que n sea mutable
    while (contador>=0) {
      println(s"$contador")
      contador-=1
    }
  }

  //Hace una cuenta atras y va indicando la paridad de cada número
  def paridades(n: Int): Unit = {
    var numeros = n //Necesitamos que n sea mutable
    for (i<- numeros to 0 by -1) {  //Incluyo el 0 y cuento hacia atrás (by -1)
      if (i%2 == 0) {
        println(s"$i es par")
      } else {
        println(s"$i es impar")
      }
    }
  }
  def main(args: Array[String]): Unit = {
    println("Dime dónde quieres que empiece la cuenta atrás: ")
    val inicio1 = StdIn.readInt()
    contador(inicio1)  //No necesitamos printear porque la función contador da un print

    println("Dime dónde quieres que empiece la cuenta atrás que mostraré con paridad: ")
    val inicio2 = StdIn.readInt()
    paridades(inicio2) //No necesitamos printear porque la función paridades da un print

  }
}
