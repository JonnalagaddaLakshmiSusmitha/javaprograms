import java.util.Scanner;
class Cube
  {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
      System.out.print("enter any number");
      int n= sc.nextInt();
      for (int i=1;i<=n;i++)
        {
          System.out.println("the cubic number of" +i+ "is"+(i*i*i));  
        }
    }
  }