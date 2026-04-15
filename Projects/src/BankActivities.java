import java.util.Scanner;

public class BankActivities{


    int response;
    private double balance;
    double amount;
    private final Scanner scanner;


    BankActivities(Scanner scanner, double balance){
        this.scanner = scanner;
        this.balance = balance;
    }

    public void Menu(){
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit Money");
        System.out.println("4.Money Transfer");
        System.out.println("5.Exit");
    }

    public void action(){
        System.out.println("What activity would you like to do?: ");
        response = scanner.nextInt();

        switch (response){
            case 1 -> System.out.println("Your balance is " + checkBalance());
            case 2 -> withdraw();
            case 3 -> deposit();
            case 4 -> MoneyTransfer();
            case 5 -> System.exit(0);
            default -> System.out.println("Invalid Choice");
        }
    }

    public double checkBalance(){
        return  balance;
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();
        balance -= amount;
        System.out.println("You have successfully withdrawn " + amount);
        System.out.println("Your new balance is " + balance);
    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();
        if(amount < 1000){
            System.out.println("Minimum deposit of Rs.1000 \n please try again!");
        }
        else {
            balance += amount;
            System.out.println("You have successfully deposited " + amount);
            System.out.println("Your new balance is " + balance);
        }

    }

    public void MoneyTransfer(){
        System.out.println("Enter the amount ");
        amount = scanner.nextDouble();
        balance -= amount;
        System.out.println("You have successfully transferred " + amount);
        System.out.println("Your new balance is " + balance);
    }

}