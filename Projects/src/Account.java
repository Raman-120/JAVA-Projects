import  java.util.Scanner;
public class Account {



    String response;
    String firstName;
    String lastName;
    int pin;
    private Scanner scanner;
    double amount;
    private BankActivities b;

    public Account( Scanner scanner){
        this.scanner = scanner;
        this.b = new BankActivities(scanner);
    }

    public void basic(){
        System.out.print("Enter your name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Set up a pin: ");
        pin = scanner.nextInt();

        System.out.println("You have created your account.");
        System.out.print("Would you like to deposit money?: ");
        scanner.nextLine();
        response = scanner.nextLine();


        if(response.equals("no")){
            System.out.print("Thanks for creating your account ");
        }
        else {
            b.deposit();
        }

    }






}

