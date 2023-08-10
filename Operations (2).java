class Operations
  {
    void operator()
    {
      System.out.println("math operators");
    }
void operator(int a,int b)
  {
  System.out.println("sum is "+(a+b));
  }
void operator(int a,float b)
  {
  System.out.println("subtraction is"+(a-b));
  }
void operator(float a,float b)
  {
  System.out.println("multiplication is"+(a*b));
  }
void operator(float a,int b)
  {
  System.out.println("division is "+(a/b));
  }
  }
class Operators
  {
    public static void main(String args[])
    {
      Operations o=new Operations();
      o.operator();
      o.operator(4,5);
      o.operator(4,6);
      o.operator(5,7);
      o.operator(6,7);
    }
  }
