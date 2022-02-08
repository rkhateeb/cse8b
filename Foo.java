// Inside Foo.java
public class Foo {
  String str;

  Foo(String str) {
    this.str = str;
  }

  void print(int val) {
    String str = "lum";
    if (val % 2 == 0) {
      System.out.print(str + "foo");
    } else {
      System.out.print(str + "bar");
    }
  }
}
