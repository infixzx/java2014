package Lesson8;

public class Test {
    static int counterOfCreatedClasses = 0;
    int age = 0;
    int lenght = 0;

    Test()
    {
        counterOfCreatedClasses++;
    }

    public static void main(String[] args)
    {
        Test t = new Test();
        t.age = 40;
        System.out.println(t.age);

        t = new Test();
        t.age = 40;
        System.out.println(t.age);


        final Test constT = new Test();
        constT.age = 38;
        System.out.println(constT.age);
        //constT = new Test();

        System.out.println("Числа созданных классов за всё время(сколько раз был вызван кунструктов = "
                + counterOfCreatedClasses);
    }
}