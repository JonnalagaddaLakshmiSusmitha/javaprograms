class Calculator
  {
    void addition(int a,int b)
    {
      int sum=a+b;
      System.out.println("the sum is"+sum);
    }
    void addition(int a,int b,int c)
    {
      int sum=a+b+c;
      System.out.println("the sum is"+sum);
    }
    void addition(int a,int b,int c,int d)
    {
      int sum=a+b+c+d;
      System.out.println("the sum is"+sum);
    }
  }
class Calculators
  {
    public static void main(String args[])
    {
      Calculator c=new Calculator();
      c.addition(10,20);
      c.addition(13,15,19);
      c.addition(11,10,21);
    }
  }