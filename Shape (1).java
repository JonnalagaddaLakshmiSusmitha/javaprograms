class MethodOverloading {
  void area() {
    System.out.println("area of rectangle,area of circle,area of square");
  }

  void area(int length, int breadth) {
    System.out.println("area of rectangle is:" + (length * breadth));
  }

  void area(int side) {
    System.out.println("area of square is:" + (side * side));
  }

  void area(double pi, int r) {
    System.out.println("area of circle is:" + (pi * r * r));
  }
}

class Shape {
  public static void main(String args[]) {
    MethodOverloading m = new MethodOverloading();
    m.area();
    m.area(10, 14);
    m.area(5);
    m.area(3.14, 2);
  }
}