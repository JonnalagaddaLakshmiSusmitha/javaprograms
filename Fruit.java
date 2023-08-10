class Fruit
  {
    void eat()
    {
      System.out.println("eating");
    }
  }
class Mango extends Fruit
  {
    void sweet()
    {
      System.out.println("it is sweet");
    }
  }
class Apple extends Mango
  {
    void healthy()
    {
    System.out.println("it is healthy");
}
}
class hierarichal
  {
    public static void main(String args[])
    {
      Mango m=new Mango();
      Apple a=new Apple();
      m.sweet();
      a.healthy();
    }
  }