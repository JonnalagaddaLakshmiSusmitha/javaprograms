class Person
  {
    String name;
    int age;
    String address;
    Person(String n,int a,String add)
    {
      name=n;
      age=a;
      address=add;
    }
    public void display()
    {
      System.out.println(name+" "+age+" "+address);
    }
    public static void main(String args[])
    {
      Person person=new Person("susmitha",22,"bhavanipuram");
      person.display();
    }
  }