class Bird
  {
    void dance()
    {
    System.out.println("dancing");
    }
  }
class Peacock extends Bird
{
  void eat()
  {
    System.out.println("eating");
  }
}
class babypeacock extends Peacock{
  void scream()
  {
    System.out.println("screaming");
  }
}
    class MultilevelInheritance
      {
        public static void main(String args[])
        {
         babypeacock p=new babypeacock();
          p.dance();
          p.eat();
          p.scream();
        }
      }