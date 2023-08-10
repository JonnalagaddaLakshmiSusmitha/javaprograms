class Emp
  {
    String name;
    int salary;
    String designation;
    Emp(String n,int s,String d)
    {
      name=n;
      salary=s;
      designation=d;
    }
    public void display()
    {
      System.out.println(name+" "+salary+" "+designation);
    }
    public static void main(String args[])
    {
      Emp emp=new Emp("susmitha",10000,"intern");
      emp.display();
    }
  }
    