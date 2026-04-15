import java.util.Scanner;

public class simpleBankingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account createAccount = new Account(scanner);

        String response;


        System.out.print("Do you have an account in our bank?: ");
        response = scanner.nextLine();

        if(response.equals("no")){
            System.out.print("Would you like to create one: ");
            response = scanner.nextLine();
            if(response.equals("yes")){
                createAccount.basic();
                BankActivities activities = createAccount.getBankActivities();
                activities.Menu();
                activities.action();
            }
        }

    }
}
