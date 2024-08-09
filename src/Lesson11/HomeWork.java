package Lesson11;

public class HomeWork {
    public static void main(String[] args)
    {
        Car ferrari  = new Car("Red", "V8", 2);
        ferrari.print();

        Car bmw = new Car("Blue", "V6", 4);
        bmw.print();

        CarTest.changeDoorCount(3, ferrari);
        ferrari.print();

        CarTest.swapColor(ferrari, bmw);
        ferrari.print();

        bmw.print();
    }
}

class Car {
    String color;
    String engine;
    int doorCount;

    static int countCar = 0;
    int myCount;

    Car()
    {
        countCar++;
        myCount = countCar;
    }

    Car(String color, String engine, int doorCount)
    {
        countCar++;
        myCount = countCar;
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    void print()
    {
        System.out.println("\nCar: " + myCount);
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Door count: " + doorCount);
    }
}

class CarTest {
    public static void changeDoorCount(int newDoorCount, Car car)
    {
        car.doorCount = newDoorCount;
    }

    public static void swapColor(Car first, Car second)
    {
        Car temp = new Car();
        temp.color = first.color;
        first.color = second.color;
        second.color = temp.color;
    }
}