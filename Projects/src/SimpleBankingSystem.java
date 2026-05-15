import java.util.Scanner;
import java.io.FileWriter;
import java.util.InputMismatchException;

public class SimpleBankingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner);
        BankActivities activities = account.getBankActivities();

        String response;
        double balance = 50000;
        String username = "raman";
        int pin= 455;

        System.out.print("Do you have an account in our bank?: ");
        response = scanner.nextLine();


            if(response.equals("no")){
                System.out.print("Would you like to create one: ");
                response = scanner.nextLine();
                if(response.equals("yes")){
                    account.basic();
                }
                else {
                    System.out.println("Thanks for visiting our site.");
                    System.exit(0);
                }
            }
            else if(response.equals("yes")){
                account.alreadyExist();
                if(username.equals(account.getUsername()) && pin == account.getPin()){
                    activities.setBalance(balance);

                }
                else {
                    System.out.println("Incorrect username or password.");
                }

            }
            else{
                System.out.println("Invalid input.");
                System.out.println("Please re-run the program again.");
                System.exit(0);
            }

            while(true){
                activities.Menu();
                activities.action();
            }



    }
}
