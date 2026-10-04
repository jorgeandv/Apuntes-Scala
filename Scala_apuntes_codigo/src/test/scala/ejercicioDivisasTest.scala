class MoneyTest extends munit.FunSuite:
  var _12clp: Money = null
  var _14clp: Money = null
  
  override def beforeEach(context: BeforeEach): Unit =
    _12clp = new Money(12, "CLP")
    _14clp = new Money(14, "CLP")

  test("Igualdad de dos objetos Money con el mismo monto y divisa"): //Estamso testeando que la clase Money funcione bien
    assertEquals(_12clp, _12clp) //Esto es trivial, pues etamos comaprando un objeto consigo mismo
    assertEquals(_12clp, new Money(12, "CLP")) //Este es más útil pues comparamos dos objetos que tienen los mismos datos
    assertNotEquals(_12clp, _14clp)

  test("Sumar dos objetos Money de la misma divisa funciona"):
    assertEquals(_12clp.add(_14clp), new Money(26, "CLP"))




class MoneyBagTest extends munit.FunSuite:
  var _mb1: MoneyBag = null
  var _mb2: MoneyBag = null
  // ...

  override def beforeEach(context: BeforeEach): Unit =
    _12clp = new Money(12, "CLP")
    // ...
    _mb1 = new MoneyBag(_12clp, _7usd))
  _mb2 = new MoneyBag(_14clp, _21usd))
  // ...

  test("Igualdad reflexiva de MoneyBag"):
    assertEquals(_mb1, _mb1) // a == a
  test("Igualdad simétrica de MoneyBag"):
    assertEquals(_mb1, _mb3) // a == b
  assertEquals(_mb3, _mb1) // <==> b == a
  test("Igualdad transitiva de MoneyBag"):
    assertEquals(_mb1, _mb3) // a == b
  assertEquals(_mb3, _mb4) // && b == c
  assertEquals(_mb1, _mb4) // <==> a == c
  test("Bolsas distintas no son iguales"):
    assertNotEquals(_mb1, _mb2)