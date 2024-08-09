package Lesson12;

import Lesson11.Student;

public class Homework {
    public static void main(String[] args)
    {
        Student vlad1 = new Student("vlad", 4, 4.5);
        Student nedovlad = new Student("vlad", 4, -2.0);
        Student trueVlad = new Student("vlad", 4, 4.5);

        StudentTest.equelNestedIfStatement(vlad1, trueVlad);
        StudentTest.equalIfStatement(vlad1, trueVlad);

        System.out.println();
        StudentTest.equelNestedIfStatement(vlad1, nedovlad);
        StudentTest.equalIfStatement(vlad1, nedovlad);
    }
}

class StudentTest {
    public static boolean equalIfStatement(Student first, Student second)
    {
        if((first.grade == second.grade) && (first.course == second.course) && (first.name == second.name))
        {
            System.out.println("Студент " + first.name + " = студенту " + second.name);
            return true;
        }
        else
        {
            System.out.println("Студент " + first.name + " не равен студенту " + second.name);
            return false;
        }
    }

    public static boolean equelNestedIfStatement(Student first, Student second)
    {
        if(first.name == second.name)
        {
            if(first.course == second.course)
            {
                if(first.grade == second.grade)
                {
                    System.out.println("Студент " + first.name + " = студенту " + second.name);
                    return true;
                }
                else
                {
                    System.out.println("grade студентов: " + first.name + ", " + second.name + " только не равны!");
                }
            }
            else
            {
                System.out.println("course студентов: " + first.name + ", " + second.name + " как минимум не равны!");
                return false;
            }
        }
        else
        {
            System.out.println("name студентов: " + first.name + ", " + second.name + " как минимум не равны!");
            return false;
        }
        return false;
    }
}
