package Lesson3;

public class Homework32 {
    public static void main(String[] args)
    {
        int a = 5;
        int a_result = a-- - --a + ++a + a++ + a;

        int b = 8;
        int b_result = ++b - b++ + ++b - --b;

        System.out.println("A out = " + a_result + ",\nB out = " + b_result);
    }
}
