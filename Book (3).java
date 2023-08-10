/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class Book
  {
    String title;
    String author;
    int year;
    public void initialise(String t,String a,int y)
    {
      title=t;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println("the book title is"+title);
      System.out.println("the author name is"+author);
      System.out.println("the book was published in the year"+year);
    }
    public static void main(String args[])
    {
      Book b=new Book();
      b.initialise("java","james gosling",1995);
      b.display();
    }
  }