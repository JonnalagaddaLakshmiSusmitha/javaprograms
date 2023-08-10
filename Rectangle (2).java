/*Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle.*/
import java.util.Scanner;
public class Rectangle
  {
    int length;
    int width;
    public void display()
    {
      System.out.println("the perimeter of rectangle"+(2*(length+width)));
      System.out.println("the area of rectangle"+(length*width));
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Rectangle r=new Rectangle();
      System.out.println("enter length");
      r.length=sc.nextInt();
      System.out.println("enter width");
      r.width=sc.nextInt();
      r.display();
    }
  }