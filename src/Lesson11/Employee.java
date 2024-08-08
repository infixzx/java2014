package Lesson11;

class doubleWrapper {
    double number;

    doubleWrapper(double number)
    {
        this.number = number;
    }

    void print()
    {
        System.out.println(number);
    }
}

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void doubleUpSalary()
    {
        this.salary *= 2;
    }

    public static void doubleUp(double[] number)
    {
        number[0] *= 2;
    }

    public static void doubleUpWrapper(doubleWrapper dW)
    {
        dW.number *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args)
    {
        double[] x = new double[1];
        x[0] = 10;
        System.out.println(x[0]);
        Employee.doubleUp(x);
        System.out.println(x[0]);

        doubleWrapper number = new doubleWrapper(100.55);
        number.print();
        Employee.doubleUpWrapper(number);
        number.print();
    }
}