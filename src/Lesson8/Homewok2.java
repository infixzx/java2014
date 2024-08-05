package Lesson8;

public class Homewok2 {
    public final static double PI = 3.14;

    public static void main(String args[]) {
        OneClass2 HM = new OneClass2();

        System.out.println("Площадь круга для радиуса 5.2 = " + HM.circleArea(5.2));
        System.out.println("Длинна окружности для радиуса 2.4 = " + OneClass2.circleLenght(2.4));
        HM.fullPrint(11.3);
    }
}

class OneClass2
{
    double circleArea(double radius)
    {
        return (radius * radius * Homewok2.PI);
    }

    static double circleLenght(double radius)
    {
        return (2.0 * Homewok2.PI * radius);
    }

    void fullPrint(double radius)
    {
        System.out.println("\nВаш радиус = " + radius);
        System.out.println("Площадь круга = " + circleArea(radius));
        System.out.println("Длинна окружности = " + circleLenght(radius) + "\n");
    }
}