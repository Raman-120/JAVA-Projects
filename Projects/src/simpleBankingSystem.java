import java.util.Scanner;

public class simpleBankingSystem {
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
            else{
                account.alreadyExist();
                if(username.equals(account.getUsername()) && pin == account.getPin()){
                    activities.setBalance(balance);

                }
                else {
                    System.out.println("Incorrect username or password.");
                }

            }

            while(true){
                activities.Menu();
                activities.action();
            }



    }
}
