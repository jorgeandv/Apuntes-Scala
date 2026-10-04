/*

//JUnit
//------------------------------------------------------------------------------------------------------------------------------------------------------------
//Importamos las cosas que usaremos de JUnit
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.{BeforeEach, DisplayName, Test}

//Definimos la clase CalculatorTest que es un Test Suite
class Calculator1Test:
  var calculator: Calculator = null

  //Damos la preparación para los test (Los métodos que se ejecutan antes de los test)
  @BeforeEach
  def setUp(): Unit =
    calculator = new Calculator("Test Calculator")  //Creamos una calculadora

  //Damos el metodo que usaremos como test con su respectivo assert
  @Test
  @DisplayName("Test addition of two positive integers")  //Le ponemos otro nombre al metodo (test) para entender mejor cuando se ejecute
  def testAddPositiveIntegers(): Unit =   //Probar la suma de dos enteros positivos
    val result = calculator.add(2, 3)
    assertEquals(5, result)

//El JUnit corre en Scala, pero siempre es mejor usar MUnit para Scala

//Si quisieramos poner más métodos que usar como test, a cada uno hay que ponerle el @Test encima
    
//En este caso no se necesitó dar la limpieza de los test (Los métodos que se ejecutan despues de los test), con @AfterEach
//------------------------------------------------------------------------------------------------------------------------------------------------------------

//MUnit
//------------------------------------------------------------------------------------------------------------------------------------------------------------
class Calculator2Test extends munit.FunSuite:
  var calculator: Calculator = null
  
  override def beforeEach(context: BeforeEach): Unit =
    calculator = new Calculator("Test Calculator")
    
  test("Test addition of two positive integers"):
    val result = calculator.add(2, 3)
    assertEquals(5, result)
    
  
 */