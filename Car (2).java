class Car
  {
    String model;
    int year;
    public void display()
    {
      System.out.println("the model of car is"+model);
      System.out.println("the year of car is"+year);
    }
    public static void main(String args[])
    {
      Car c1=new Car();
      Car c2=new Car();
      Car c3=new Car();
      c1.model="ertiga";
     c1.year=2001;
     c2.model="brezza";
      c2.year=2000;
      c3.model="safari";
      c3.year=2002;
      c1.display();
      c2.display();
      c3.display();
    }
  }