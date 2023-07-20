class Vehicle
  {
    void start_engine()
    {
      System.out.println("engine starting");
    }
  }
class Car extends Vehicle
  {
    void start_engine()
    {
      System.out.println("car engine starting");
    }
  }
class Motorcycle extends Vehicle{
  void start_engine()
  {
    System.out.println("Motorcycle engine starting");
  }
}
class Engine
  {
    public static void main(String args[])
    {
      Vehicle v=new Vehicle();
      Vehicle car=new Car();
      Vehicle mc=new Motorcycle();
      v.start_engine();
      car.start_engine();
      mc.start_engine();
    }
  }