/*Create a superclass called "Animal" with the following attributes:
String name
int age
String breed*/
  class Animal1
  {
    String name;
    int age;
    String breed;
    void show()
    {
      System.out.println("these alla are animals");
    }
  }
class Dog extends Animal1
  {
    void show()
    {
      System.out.println("the dog nameis"+name+"age is"+age+"breed is"+breed);
    }
  }
class SingleInheritance
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.name="kala";
      d.age=5;
      d.breed="Germansheppard";
      d.show();
    }
  }