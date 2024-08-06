package Lesson9;

public class Homework21 {

}

class Test1 {
    int a = 1;
    //static int a = 2; // не скомпилируется просто

    void abc(int a)
    {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.abc(3);
    }
}

class Test2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a)
    {
        System.out.println(a); // а переопределится, и выведит 5
        System.out.println(Test2.b); // 2
    }

    public static void main(String[] args)
    {
        abc(5);
    }
}

class Test3 {
    int a = 1;
    static int b = 2;

    void abc(int a)
    {
        System.out.println(b); // 2
        System.out.println(a); // 4
        System.out.println(this.a); // 1
        System.out.println(Test3.b); // 2
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}