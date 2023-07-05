import java.util.Scanner;
public class Number
  {
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      System.out.print("input first number");
      int num1=in.nextInt();
      System.out.print("input second number");
      int num2=in.nextInt();
      System.out.print("input third number");
      int num3=in.nextInt();
      System.out.print("input fourth number");
      int num4=in.nextInt();
      if (num1 == num2 && num2 == num3 && num3 == num4)
      {
        System.out.println("numbers are equal.");
      }
      else{
        System.out.print("numbers are not equal!");
      }
    }
  }