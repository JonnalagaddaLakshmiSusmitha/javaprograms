class Animal
{
  void eat()
  {
    System.out.println("eating");
  }
}
class elephant extends Animal
{
  void trumpet()
  {
  System.out.println("trumpeting");
  }
}
class SingleInheritance
  {
    public static void main(String args[])
    {
elephant e=new elephant();
e.eat();
  e.trumpet();
    }
  }