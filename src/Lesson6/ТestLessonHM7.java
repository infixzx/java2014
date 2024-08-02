package Lesson6;

public class ТestLessonHM7 {

    public static void main(String[] args)
    {
        Lesson7.Employee e1 = new Lesson7.Employee(200, "kor", 2, 0, 0 );
        //Lesson7.Employee e_privat = new Lesson7.Employee(300, "ff", 3, 0);
        //Lesson7.Employee e_public = new Lesson7.Employee(400, "xx", 4, 0, 0);
        System.out.println(e1.surname);

        e1.printId();
        e1.printSalary();
        e1.printSurname();
    }
}
