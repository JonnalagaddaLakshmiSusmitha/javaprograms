class Student
  {
    String name;
    int rollno;
    String grade;
    Student(String n,int r,String g)
    {
      name=n;
      rollno=r;
      grade=g;
    }
    public void display()
    {
      System.out.println(name+" "+rollno+" "+grade);
    }
    public static void main(String args[])
    {
    Student student=new Student("susmitha",9,"A");
      student.display();
    }
  }