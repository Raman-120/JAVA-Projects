import  java.util.Scanner;
public class Account {

    String username;
    String firstName;
    String lastName;
    int pin;
    private final Scanner scanner;
    private final BankActivities b;

    public Account(Scanner scanner){
        this.scanner = scanner;
        this.b = new BankActivities(scanner, 0);
    }

    public void basic(){
        System.out.print("Enter your name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Set up a pin: ");
        pin = scanner.nextInt();

        System.out.println("You have created your account.");
        System.out.println("Please deposit minimum of Rs.1000.");
        b.deposit();
    }

    public void alreadyExist(){
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        pin = scanner.nextInt();
    }

    public String getUsername(){
        return username;
    }

    public int getPin(){
        return pin;
    }

    public  BankActivities getBankActivities(){
        return  b;
    }
}

