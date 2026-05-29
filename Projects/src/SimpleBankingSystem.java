import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.DataInputStream;
import java.io.FileInputStream;


public class SimpleBankingSystem {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner);
        BankActivities activities = account.getBankActivities();
        account.openFile();
        DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));

        // for demo to use as an existing account
        String response;
        String storedUsername = dis.readUTF();
        double balance = 0;
        String username = account.getUsername();
        int pin = account.getPin();
        int storedPin = dis.readInt();
        boolean isLogin = false;

        try {
            System.out.print("Do you have an account in our bank?: ");
            response = scanner.nextLine();


            if (response.equals("no")) {
                System.out.print("Would you like to create one: ");
                response = scanner.nextLine();

                if (response.equals("yes")) {
                    account.basic();
                    account.alreadyExist();
                    account.deposit();
                    isLogin = true;
                } else {
                    System.out.println("Thanks for visiting our site.");
                    System.exit(0);
                }
            } else if (response.equals("yes")) {

                account.alreadyExist();
                try{
                    if (username.equals(storedUsername) && pin == storedPin) {
                        activities.setBalance(balance);
                        isLogin = true;
                    } else {
                        System.out.println("Incorrect username or password.");
                    }
                }catch (NullPointerException e){
                    System.out.println("Could't locate.");
                }


            } else {
                System.out.println("Invalid input.");
                System.out.println("Please re-run the program again.");
                System.exit(0);
            }

        } catch (InputMismatchException | IOException e) {
            System.out.println("Invalid input.");
        }

        while (isLogin) {
            activities.Menu();
            activities.action();
        }

        account.closeFile();
    }
}
