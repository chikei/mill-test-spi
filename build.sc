import mill._
import mill.scalalib._

object example extends ScalaModule {
  def scalaVersion = "2.12.10"
  def ivyDeps = Agg(ivy"com.beetstra.jutf7:jutf7:1.0.0")

  object test extends Tests {
    def ivyDeps = Agg(ivy"com.lihaoyi::utest:0.7.1")
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
