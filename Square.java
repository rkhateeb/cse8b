// Inside Square.java
class Square extends Shape {
  @Override
  public String func(String str) {
    System.out.print(str);
  }

  public static void main(String[] args) {
    Square square = new Square();
    square.func("square");
  }
}
