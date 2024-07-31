package Lesson5;

public class Homework2 {
    public static void main(String[] args)
    {
        StudentTest ST = new StudentTest();
        Student.printAverange(ST.ariva);
    }
}

class Student
{
    int studentCardNumber;
    String firstName;
    String secondName;
    int yearLesson;
    double averageMathScore;
    double averageEconomyScore;
    double averageForeignLanguageScore;

    Student(int studentCardNumber, String firstName, String secondName, int yearLesson,
            double averageMathScore, double averageEconomyScore, double averageForeignLanguageScore)
    {
        this.studentCardNumber = studentCardNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearLesson = yearLesson;
        this.averageMathScore = averageMathScore;
        this.averageEconomyScore = averageEconomyScore;
        this.averageForeignLanguageScore = averageForeignLanguageScore;
    }

    public void printData()
    {
        double averageFull = (averageMathScore + averageEconomyScore + averageForeignLanguageScore) / 3;
        System.out.println("Зовут: " + firstName + " " + secondName);
        System.out.println("Номер студенчего билета: " + studentCardNumber + ", год обучения: " + yearLesson);
        System.out.println("Cредняя оценка по матеметике, экономике, иностранному языку: " + averageFull + "\n");
    }

    static void printAverange(Student PrintStudent)
    {
        double averageFull = (PrintStudent.averageMathScore + PrintStudent.averageEconomyScore
                + PrintStudent.averageForeignLanguageScore) / 3;
        System.out.println("Cредняя оценка по матеметике, экономике, иностранному языку: " + averageFull + "\n");
    }
}

class StudentTest
{
    Student vlad = new Student(4, "Владислав", "Kоробов", 2020, 5, 4.5, 3);
    Student ariva = new Student(3, "Aрина", "Несмеева", 2019, 5, 5, 4);
    Student vanya = new Student(5, "Ваня", "Балбес", 2018, 3, 3, 3);
}