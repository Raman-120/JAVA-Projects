import java.util.Scanner;

public class simpleBankingSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String PIN;
        double balance;
        boolean isExist;
        String response;

        System.out.print("Do you have an account in our bank?: ");
        response = scanner.nextLine().toLowerCase();
        if(response.equals("no")){
            System.out.print("Would you like to create an account?: ");
            String userResponse = scanner.nextLine().toLowerCase();
            if(userResponse.equals("yes")){
                System.out.print("Enter your firstName: ");
                firstName = scanner.nextLine();

                System.out.print("Enter your last Name: ");
                lastName = scanner.nextLine();

                System.out.print("Set your pin: ");
                PIN = scanner.nextLine();

                CreateAccount account = new CreateAccount(firstName,lastName,PIN,scanner);
                account.displayAndDepositMessage();
            }
        }








    }
}
