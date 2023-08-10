import java.util.Scanner;
class Book
  {
    String title;
    int id;
    String author;
    int year;
    public void displayDetails()
    {
      System.out.println(title+" "+id+" "+author+" "+year);
    }
    public void setDetails(String t,int i,String a,int y)
    {
      title=t;
      id=i;
      author=a;
      year=y;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("how many number of books");
      int count=sc.nextInt();
      Book b[]=new Book[count];
      for(int i=0;i<count;i++)
        {
          System.out.println("enter book"+(i+1)+"details");
          b[i]=new Book();
          System.out.println("enter the title of the book");
          String bname=sc.next();
          System.out.println("enter the id of the book");
          int bid=sc.nextInt();
          System.out.println("enter the author of the book");
          String bauthor=sc.next();
          System.out.println("enter year");
          int byear=sc.nextInt();
          b[i].setDetails(bname,bid,bauthor,byear);
        }
      for(int i=0;i<count;i++)
        {
          b[i].displayDetails();
        }
    }
  }