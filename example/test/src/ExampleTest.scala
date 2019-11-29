import utest._

object ExampleTest extends TestSuite{
  val tests = Tests{
    test("test1"){
      Example.utf7Charset
    }
  }
}
