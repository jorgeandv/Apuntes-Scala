class Money(val cantidad: Int, val divisa: String):
  override def toString: String =
    s"Money($cantidad, $divisa)"

  override def equals(obj: Any): Boolean =
    if obj.isInstanceOf[Money] then
      val other = obj.asInstanceOf[Money]
      cantidad == other.cantidad && divisa == other.divisa
    else false

  def add(otraCantidad: Money): Money = {
    val sumaCantidades = otraCantidad.cantidad + cantidad
    new Money(sumaCantidades, divisa)
  }





