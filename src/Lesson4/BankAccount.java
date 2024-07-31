package Lesson4;

public class BankAccount {
    int id = 10;
    String name = "Пётр";
    double balance = 100;
}

class BankAccountTest {
    public static void main(String[] args)
    {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Vlad";
        MyAccount.balance = 12.35;

        YourAccount = MyAccount;

        System.out.println(YourAccount.name);
    }
}

