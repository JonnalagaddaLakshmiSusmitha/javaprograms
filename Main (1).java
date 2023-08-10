import java.util.*;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rollno");
        int rollno=sc.nextInt();
        sc.nextLine();
         System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter address");
        String address=sc.nextLine();
        System.out.println(rollno+" "+name+" "+address);

    }
}