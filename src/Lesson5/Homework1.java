package Lesson5;

public class Homework1 {
    public static void main(String[] args)
    {
        BankAccount BA = new BankAccount(3, "Vlad", 525.7);
        BA.printBalance();

        BA.popolnenieScheta(205.7);
        BA.printBalance();

        BA.snyatieSoScheta(107.4);
        BA.printBalance();
    }
}

class BankAccount {
    int id;
    String name;
    double balance;

    BankAccount(int id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    double popolnenieScheta(double value)
    {
        this.balance += value;
        System.out.println("Баланс " + this.name + "a" + " увеличен на " + value);
        return this.balance;
    }

    double snyatieSoScheta(double value)
    {
        this.balance -= value;
        System.out.println("Баланс " + this.name + "a" + " уменьшен на " + value);
        return this.balance;
    }

    void printBalance()
    {
        System.out.println("Balance " + this.name + ": " + this.balance);
    }
}
