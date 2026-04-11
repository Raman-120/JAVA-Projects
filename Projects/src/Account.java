import java.util.Scanner;

public class Account {

    String firstName;
    String lastName;
    String PIN;
    Scanner scanner;

    Account(String firstName, String lastName, String PIN, Scanner scanner){
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
        this.scanner = scanner;
    }
}
