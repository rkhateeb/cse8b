// Inside Sedan.java
class Sedan extends Vehicle {
  @Override
  public void drive(double miles) {
    System.out.print("sedan drive miles");
    this.foo();
  }

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    sedan.drive(1.5);
  }
}
