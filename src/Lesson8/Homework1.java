package Lesson8;

public class Homework1 {
    public static void main(String args[])
    {
        System.out.println(OneClass.multiplicationOf3Numbers(4, 3, 2));
        System.out.println(OneClass.multiplicationOf3Numbers(12, 9.4, 8.1));
        OneClass.divideAbyB(10.0, 3.0);
        OneClass.divideAbyB(10.5, 3.0);
    }
}

class OneClass {
    static double multiplicationOf3Numbers(double a, double b, double c)
    {
        return (a * b * c);
    }

    static void divideAbyB(double a, double b)
    {
        int wholePart = (int)(a / b);
        double fractionalPart = a % b;
        System.out.println("\nПри деление числа " + a + " на " + b + " :");
        System.out.println("Целое частное: " + wholePart);
        System.out.println("Остаток: " + fractionalPart + "\n");
    }
}