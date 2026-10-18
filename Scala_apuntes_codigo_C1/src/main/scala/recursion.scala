object recursion {
  def sumUpTo(n: Int): Int = {
    if n==0 then 0
    else n+sumUpTo(n-1) //Recordar que if, else if, else devuelven una expresión
  }
  //Si en lo anterior no usamos el else, la linea n+sumUptTo(n-1) se ejecutaría siempre, incluso en el caso base, no tendría sentido
}
