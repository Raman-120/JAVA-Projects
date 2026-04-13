import jdk.dynalink.NamedOperation;

import java.util.Scanner;

public class simpleBankingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account createAccount = new Account(scanner);
        BankActivities activities = new BankActivities(scanner);

        String firstName;
        String lastName;
        String response;
        int pin;
        double balance;
        double amount;
        boolean isExist;

        System.out.print("Do you have an account in our bank?: ");
        response = scanner.nextLine();

        if(response.equals("no")){
            System.out.print("Would you like to create one: ");
            response = scanner.nextLine();
            if(response.equals("yes")){
                createAccount.basic();

            }
        }

    }
}
