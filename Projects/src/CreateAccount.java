import java.util.Scanner;

public class CreateAccount extends Account{

    double amount;
    CreateAccount(String firstName, String lastName, String PIN, Scanner scanner){
        super(firstName, lastName,PIN,scanner);
    }

    public void displayAndDepositMessage(){
        System.out.println("You have successfully created your account.");
        System.out.println("Would you like to deposit some amount?: ");
        String response = scanner.nextLine().toLowerCase();
        if(response.equals("yes")){
            System.out.println("Enter the amount: ");
            amount = scanner.nextDouble();
        }
        else{
            System.out.println("Thanks for using our service.");
        }
        System.out.println("Your balance is " + amount);
    }


}
