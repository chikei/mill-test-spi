import java.nio.charset.Charset

object Example{
  lazy val utf7Charset = java.nio.charset.Charset.forName("utf-7")

  def main(arg: Array[String]): Unit = {
    utf7Charset
  }
}
