package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.B;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;

import static Lesson10.p1.p2.B.countStatic;
import static Lesson10.p1.p2.B.helloStatic;

public class D {
    int defaultD = 1337; // не будет видна в Е(т.к подпакет это что другое, самостоятельное)
    public int d = 3;

    public static void main(String[] args)
    {
        A classA = new A();
        C classC = new C();
        E classE = new E();
        B classB = new B(); // не обязательно т.к использутся static переменные

        System.out.println("ClassA.a = " + classA.a);
        System.out.println("classC.c = " + classC.c);
        System.out.println("classE.e = " + classE.e);
        System.out.println("countStatic = " + countStatic);
        classB.helloStatic(); // можно так вызвать
        helloStatic(); // или так
    }
}
