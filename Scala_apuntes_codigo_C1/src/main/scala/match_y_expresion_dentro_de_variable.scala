import scala.io.StdIn

object match_y_expresion_dentro_de_variable {
  def queDiaEs(n: Int): String = {
    n match {
      case 1 => "Lunes"
      case 2 => "Martes"
      case 3 => "Miercoles"
      case 4 => "Jueves"
      case 5 => "Viernes"
      case 6 => "Sabado"
      case 7 => "Domingo"
      case _ => "Ingresaste un número no válido"
    }
  }

  def main(args: Array[String]): Unit = {
    //Imprime el día para mostrarselo al usuario
    println("Ingresa el número que representa el día: ")
    val dia = StdIn.readInt()
    println(queDiaEs(dia))
    //Guarda el día en una variable para despues Hacer cosas con ese dato
    val diaAuxiliar = queDiaEs(dia)
    diaAuxiliar match {
      case "Sabado"|"Domingo" => println("ES FIN DE SEMANA")
      case _ => print("no es fin de semana :(")
    }

    /*Ejemplo rápido de case con if
    val numero = 7

    numero match {
      case n if n > 0 => println("Es positivo")
      case n if n < 0 => println("Es negativo")
      case 0 => println("Es cero")
    }
  */
  }
}