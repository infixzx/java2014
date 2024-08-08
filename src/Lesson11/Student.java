package Lesson11;

public class Student {
    public String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void Swap(Student[] first, Student[] second)
    {
        Student temp = first[0];
        first[0] = second[0];
        second[0] = temp;
    }

    public static void Swap(Student first, Student second)
    {
        Student temp = new Student(first.name, first.course, first.grade);

        first.name = second.name;
        first.course = second.course;
        first.grade = second.grade;

        second.name = temp.name;
        second.course = temp.course;
        second.grade = temp.grade;
    }

    public static void Swap(StudentWrapper first, StudentWrapper second)
    {
        StudentWrapper temp = new StudentWrapper(first.student[0]);
        first.student[0] = second.student[0];
        second.student[0] = temp.student[0];
    }
}

class StudentWrapper {
    Student[] student;

    StudentWrapper(Student element)
    {
        student = new Student[1];
        student[0] = element;
    }
}

class StudentTest {
    public static void main(String[] args) {

        System.out.println("///////////////////////////////////////");

        Student[] st1 = new Student[1];
        Student[] st2 = new Student[1];

        st1[0] = new Student("Vlad", 4, 4.5);
        st2[0] = new Student("Arina", 4, 4.59);

        System.out.println(st1[0].name);
        System.out.println(st2[0].name);

        Student.Swap(st1, st2);

        System.out.println(st1[0].name);
        System.out.println(st2[0].name);

        System.out.println("///////////////////////////////////////");

        Student st11 = new Student("Vlad", 4, 4.5);
        Student st22 = new Student("Arina", 4, 4.59);

        System.out.println(st11.name);
        System.out.println(st22.name);

        Student.Swap(st11, st22);

        System.out.println(st11.name);
        System.out.println(st22.name);

        System.out.println("///////////////////////////////////////");

        StudentWrapper SW1 = new StudentWrapper(new Student("Vlad", 4, 4.5));
        StudentWrapper SW2 = new StudentWrapper(new Student("Arina", 4, 4.59));

        System.out.println(SW1.student[0].name);
        System.out.println(SW2.student[0].name);

        Student.Swap(SW1, SW2);

        System.out.println(SW1.student[0].name);
        System.out.println(SW2.student[0].name);
    }
}
