class Person
  {
    String name="susmitha";
    int age=22;
    void display(){
      System.out.println(name+" "+age);
    }
  }
class Employee extends Person
  {
    String branch="intern";
    int salary=10000;
    void display()
    {
      System.out.println(branch+" "+salary);
      super.display();
    }
    void print()
    {
      System.out.println("the details of person are");
        super.display();
    }
  }

class Super
  {
    public static void main(String args[])
    {
      Employee em=new Employee();
        em.display();
        }
  }