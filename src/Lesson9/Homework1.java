package Lesson9;

public class Homework1 {
    public static void main(String[] args)
    {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();
        Test t6 = new Test();
        Test t7 = new Test();
        Test t8 = new Test();

        t1 = null;
        t2 = null;
        t3 = null;
        t4 = null;
        t5 = null;
        t6 = null;

        //t6.helloWorld();
        t7.helloWorld();
        t8.helloWorld();
    }
}

class Test {
    static int count = 0;

    Test()
    {
        count++;
    }

    void helloWorld()
    {
        System.out.println("Привет, мир! " + ++count);
    }
}