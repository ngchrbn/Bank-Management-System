import Account.Account;
import Account.SpecialAccount;
import Bank.Bank;
import Client.Client;
import Client.CommercialClient;
import java.util.Scanner;

public class Main {

    private static final Bank bank = new Bank("BGF", "New Cairo", "01023331144"); // Initialize bank object
    public static void main(String[] args) {
        System.out.printf("%60s%n%n","********Bank Management System********");
        displayMenu();
    }

    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("\n1. Add a new client\n" +
                "2. Display existing clients\n" +
                "3. Sign In\n" +
                "4. Exit");
        System.out.print("Your choice (1 - 4): ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("Wrong Choice !");
            System.out.print("Your choice (1 - 4): ");
            choice = input.nextInt();
        }
        if (choice == 1) {
            System.out.println("\nPlease Enter Client information below");
            int clientType = getClientType();
            System.out.print("\nName: ");
            String name = input.next();
            if (clientType == 1) {
                System.out.print("National ID: ");
            } else {
                System.out.print("Commercial ID: ");
            }
            String id = input.next();
            System.out.print("Address: ");
            String address = input.next();
            System.out.print("Telephone number: ");
            String phone = input.next();
            System.out.println("\nPlease Enter Account information below");
            int accountType = getAccountType();
            System.out.print("\nAccount Number: ");
            String accountNumber = input.next();
            System.out.print("Account balance: ");
            double balance = input.nextDouble();

            // Initialize account object
            Account account;

            // Initialize client object
            Client client;

            // Initialize client object
            if (accountType  == 1) {
                // Initialize account object
                account = new Account(accountNumber, balance);
            }
            else {
                account = new SpecialAccount(accountNumber, balance);
            }
            if (clientType == 1) {
                // Initialize client object
                client = new Client(name, id, address, phone, account);
            }
            else {
                client = new CommercialClient(name, id, address, phone, account);
            }
            bank.addClient(client);
            displayMenu();
        }
        else if (choice == 2){
            bank.displayClient();
            displayMenu();
        } else if (choice == 3) {
            System.out.print("Enter your client identification: ");
            String clientID = input.next();
            bank.signIn(clientID);
            displayMenu();
        }
        else {
            System.exit(0);
        }
    }

    private static int getAccountType() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nAccount Type");
        System.out.println("1. Normal Account\n" +
                "2. Special Account");
        System.out.print("Your choice(1 - 2): ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Wrong Choice!");
            System.out.print("Your choice(1 - 2): ");
            choice = input.nextInt();
        }
        return choice;
    }

    private static int getClientType() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nClient Type");
        System.out.println("1. Normal Client\n" +
                "2. Commercial Client");
        System.out.print("Your choice(1 - 2): ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Wrong Choice!");
            System.out.print("Your choice(1 - 2): ");
            choice = input.nextInt();
        }
        return choice;
    }
}
