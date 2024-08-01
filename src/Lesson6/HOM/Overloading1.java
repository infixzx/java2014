package Lesson6.HOM;

public class Overloading1 {
    int age;
    double money;

    void show(int a, double b)
    {
        System.out.println("Сначала a, потом b");
    }

    void show(double b, int a)
    {
        System.out.println("Cначала b, потом а");
    }

    Overloading1(int age)
    {
        this.age = age;
    }

    Overloading1(double money)
    {
        this(10);
        this.money = money;
    }

    Overloading1()
    {
        this(307.5);
    }

    public static void main(String[] args)
    {
        Overloading1 ov1 = null;
        Overloading1 OV = new Overloading1();
        OV.show(5.2, 4);
        OV.show(3, 4.7);

        System.out.println(OV.age);
        System.out.println(OV.money);
    }
}
