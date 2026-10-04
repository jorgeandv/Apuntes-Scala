import scala.io.StdIn

object funciones {
  //Creamos la función que determina si un número es par o no
  def esPar(n: Int): Boolean = {
    n % 2 == 0
  }

  def prueba(x: Int): Int = {
    //Modificar un parametro (que son siempre inmutables)
    //Para esto hay que crear una variable mutable que su valor sea ese parametro
    var variableAuxiliar = x //Esta linea es un Unit
    variableAuxiliar = variableAuxiliar + 1 //Esta linea es un Unit
    variableAuxiliar  //Esta linea es un Int, lo cual es correcto según el tipo que definimos como retorno de la función

  }

  def main(args: Array[String]): Unit = {
    val paridad = esPar(16)
    println(s"El número 16 es par $paridad ")
  }
}