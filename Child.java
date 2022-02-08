// Inside Child.java
class Child extends Parent {
  @Override
  public String toString(String str) {
    return super.toString(str);
  }

  public static void main(String[] args) {
    Child child = new Child();
    System.out.print(child.toString("child"));
  }
}
