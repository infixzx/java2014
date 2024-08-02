package Lesson7;

class Homework {
    public static void main(String[] args)
    {
        Employee e1 = new Employee(200, "kor", 2);
        //Employee e_privat = new Employee(300, "ff", 3, 0);
        Employee e_public = new Employee(400, "xx", 4, 0, 0);
        System.out.println(e1.id);
        System.out.println(e1.surname);

        e1.printSurname();
        e1.printSalary();
        e1.printId();
    }
}

public class Employee {
    private double salary;
    public String surname;
    int id; // default или protected можно

    public void printSalary()
    {
        System.out.println("Salary = " + this.salary);
    }

    public void printSurname()
    {
        System.out.println("Surname = " + this.surname);
    }

    public void printId()
    {
        System.out.println("ID = " + this.id);
    }

    Employee(double salary, String surname, int id)
    {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    private Employee(double salary, String surname, int id, int private_)
    {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public Employee(double salary, String surname, int id, int public_, int tmp)
    {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
}