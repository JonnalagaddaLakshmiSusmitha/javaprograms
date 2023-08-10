class A
  {
    void message()
    {
      System.out.println("hello");
    }
  }
class B
  {
  void messageone()
  {
    System.out.println("hii");
  }
  }
class C extends A
  {
    public static void main(String args[])
      {
      C obj=new C();
    obj.message();
  }
  }
