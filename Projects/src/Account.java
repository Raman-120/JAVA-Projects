import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import  java.util.Scanner;
public class Account {

    String inputUsername;
    String firstName;
    String lastName;
    int inputPin;
    private final Scanner scanner;
    private final BankActivities b;
    DataOutputStream dos;

    public void openFile(){
        try{
            dos = new DataOutputStream(new FileOutputStream("data.bin", true)); // last ko true le append mode ho bhanera bhanxa
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public Account(Scanner scanner){
        this.scanner = scanner;
        this.b = new BankActivities(scanner, 0);
    }

    public void basic() throws IOException {
        System.out.print("Enter your name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        inputUsername = firstName + lastName;
        System.out.println("Your username is " + inputUsername);
        dos.writeUTF(inputUsername);

        System.out.print("Set up a pin: ");
        inputPin = scanner.nextInt();
        scanner.nextLine();
        dos.writeInt(inputPin);

        System.out.println("You have created your account.");
        System.out.println("Login to deposit money in your account.");


    }


    public void alreadyExist(){
        System.out.print("Enter your username: ");
        inputUsername = scanner.nextLine();
        System.out.print("Enter your pin: ");
        inputPin = scanner.nextInt();
        scanner.nextLine();
    }

    public void deposit(){
        System.out.println("Please deposit minimum of Rs.1000.");
        b.deposit();
    }

    public String getUsername(){
        return inputUsername;
    }

    public int getPin(){
        return inputPin;
    }

    public  BankActivities getBankActivities(){
        return  b;
    }

    public void closeFile() throws IOException{
        try{
            dos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

