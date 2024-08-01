package Lesson6;

public class Homework1 {
    public static void main(String[] args) {
        Summator hm1 = new Summator();
        hm1.SumNumber();
        hm1.SumNumber(4);
        hm1.SumNumber(4, 5);
        hm1.SumNumber(4, 5, 6);
        hm1.SumNumber(4, 5, 6, 7);
    }
}

class Summator {
    void SumNumber()
    {
        System.out.println("Сумма 0 чисел = 0");
    }

    void SumNumber(int var1)
    {
        System.out.println("Cумма 1 числа = " + var1);
    }

    void SumNumber(int var1, int var2)
    {
        int summa = var1 + var2;
        System.out.println("Cумма 2 чисeл = " + summa);
    }

    void SumNumber(int var1, int var2, int var3)
    {
        int summa = var1 + var2 + var3;
        System.out.println("Cумма 3 чисeл = " + summa);
    }

    void SumNumber(int var1, int var2, int var3, int var4)
    {
        int summa = var1 + var2 + var3 + var4;
        System.out.println("Cумма 4 чисeл = " + summa);
    }
}