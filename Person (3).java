public class Person {
    String name;
    int age;
    double salary;
    String major;
    double gpa;
    String company;

    public Person(String name, int age, double salary, String major, double gpa, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.major = major;
        this.gpa = gpa;
        this.company = company;
    }
}

interface Student {
    void study();
}

interface Employee {
    void work();
}

class WorkingStudent extends Person implements Student, Employee {
    public WorkingStudent(String name, int age, double salary, String major, double gpa, String company) {
        super(name, age, salary, major, gpa, company);
    }

    public void study() {
        System.out.println("Studying");
    }

    public void work() {
        System.out.println("Working");
    }
}

public class Main {
    public static void main(String[] args) {
        WorkingStudent workingStudent = new WorkingStudent("John", 25, 50000, "Computer Science", 3.5, "Google");
        workingStudent.study();
        workingStudent.work();
    }
}
