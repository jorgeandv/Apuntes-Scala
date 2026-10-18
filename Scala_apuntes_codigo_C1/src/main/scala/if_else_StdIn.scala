import scala.io.StdIn

object if_else_StdIn {
  def calificar(nota: Float): String = {
    if (nota < 4) {
      val mensaje = s"Con tu nota $nota REPROBASTE"
      mensaje
    } else if (nota == 4) {
      val mensaje = s"Con tu nota $nota APROBASTE JUSTO"
      mensaje
    } else {
      val mensaje = s"Con tu nota $nota APROBASTE FELICIDADES!"
      mensaje
    }
  }

  def main(args: Array[String]): Unit = {
    println("Ingresa tu nota para saber si pasaste o no el curso: ")
    val nota = StdIn.readFloat()
    println(s"${calificar(nota)}")  //Tengo que printear a la función calificar() porque esta retorna un string
  }
}