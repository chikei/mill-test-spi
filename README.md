```
$ ./mill example.test.test
[56/56] example.test.test
-------------------------------- Running Tests --------------------------------
X ExampleTest.test1 20ms
  java.nio.charset.UnsupportedCharsetException: utf-7
    java.nio.charset.Charset.forName(Charset.java:529)
    Example$.utf7Charset$lzycompute(Example.scala:4)
    Example$.utf7Charset(Example.scala:4)
    ExampleTest$.$anonfun$tests$2(ExampleTest.scala:6)
1 targets failed
example.test.test ExampleTest ExampleTest.test1

$ ./mill example.test.testLocal
[52/52] example.test.testLocal
-------------------------------- Running Tests --------------------------------
X ExampleTest.test1 8ms
  java.nio.charset.UnsupportedCharsetException: utf-7
    java.nio.charset.Charset.forName(Charset.java:529)
    Example$.utf7Charset$lzycompute(Example.scala:4)
    Example$.utf7Charset(Example.scala:4)
    ExampleTest$.$anonfun$tests$2(ExampleTest.scala:6)
1 targets failed
example.test.testLocal ExampleTest ExampleTest.test1

$ ./mill example.run
[37/37] example.run

$
```
