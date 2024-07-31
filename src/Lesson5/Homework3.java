package Lesson5;

public class Homework3 {
    public static void main(String[] args) {
        EmployeeTest TS = new EmployeeTest();
        TS.vlad.printData();
        TS.vlad.salaryDoubleUp();
        TS.vlad.printData();

        System.out.println("\n");

        TS.arin.printData();
        TS.arin.salaryDoubleUp();
        TS.arin.printData();
    }
}

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void salaryDoubleUp()
    {
        salary *= 2;
        System.out.println("Зарплата увеличена вдвое!");
    }

    void printData()
    {
        System.out.println(id + " " + surname + " " + age + " " + salary + " " + department);
    }
}

class EmployeeTest {
    Employee vlad = new Employee(4, "vlad", 22, 20.0, "yyy");
    Employee arin = new Employee(3, "arin", 21, 20.1, "yyy");
}