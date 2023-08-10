class Vehicle
  {
    void brand()
    {
      System.out.println("different vehicles have different brands");
    }
  }
class Car extends Vehicle
{
  void brand()
  {
    System.out.println("the car has a brand ertiga");
  }
}
class Bike extends Vehicle
  {
    void brand()
    {
      System.out.println("the bike has brand called pulsar");
    }
  }
class Vehicle1
  {
    public static void main(String args[])
    {
      Vehicle vehicle=new Vehicle();
      vehicle.brand();
      Vehicle Car=new Car();
      Car.brand();
      Vehicle Bike=new Bike();
      Bike.brand();
    }
  }