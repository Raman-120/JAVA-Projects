import java.util.Scanner;

public class BankActivities{



    double balance;
    double amount;
    private Scanner scanner;


    BankActivities(Scanner scanner){
        this.scanner = scanner;
    }

    public double checkBalance(){
        return  balance;
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        balance -= amount;
        System.out.println("You have successfully withdrawn " + amount);

    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();
        balance += amount;
        System.out.println("You have successfully deposited " + amount);
    }

    public void MoneyTransfer(){
        System.out.println("Enter the amount ");
        amount = scanner.nextDouble();
        balance -= amount;
        System.out.println("You have successfully transferred " + amount);
    }

}