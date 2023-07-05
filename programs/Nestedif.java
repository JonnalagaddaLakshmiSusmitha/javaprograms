class Nestedif
  {
    public static void main(String args[])
    {
      String country="India";
      int age=35;
      if (country=="India")
      {
        System.out.println("you are from india");
        if(age>=18)
        {
          System.out.println("eligible for vote");
        }
        else
        System.out.println("not eligible for vote");
      }
      else
      {
        System.out.println("You are not from india");
          }
          }
    }