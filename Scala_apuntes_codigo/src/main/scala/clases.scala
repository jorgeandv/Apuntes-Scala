object clases {
  class Punto(val x: Int,val y:Int):
    def moveBy(deltaX: Int, deltaY: Int): Punto = {
      new Punto(x+deltaX,y+deltaY)  //Devolvemos el objeto Punto ya movido
    }
    
    
  class Rectangle(val puntoOrigen: Punto,val alto: Int,val ancho : Int):
    def moveBy(x: Int, y: Int): Rectangle = {
      new Rectangle(puntoOrigen.moveBy(x,y), alto, ancho) //Devolvemos el objeto Rectangulo ya movido
    }
    def area(): Int = {  
      alto*ancho
    }
}
