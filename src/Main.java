import Account.Account;
import Account.SpecialAccount;
import Bank.Bank;
import Client.Client;
import Client.CommercialClient;
import java.util.Scanner;

public class Main {

    private static final Bank bank = new Bank("BGF", "New Cairo", "01023331144"); // Initialize bank object
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("1. Add a new client\n" +
                "2. Display existing clients\n" +
                "3. Exit");
        System.out.print("Your choice (1 - 3): ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Wrong Choice !");
            System.out.print("Your choice (1 - 3): ");
            choice = input.nextInt();
        }
        if (choice == 1) {
            System.out.println("\nPlease Enter Client information below");
            int clientType = getClientType();
            System.out.print("Name: ");
            String name = input.next();
            if (clientType == 1) {
                System.out.print("National ID: ");
            } else {
                System.out.print("Commercial ID: ");
            }
            long id = input.nextLong();
            System.out.print("Address: ");
            String address = input.next();
            System.out.print("Telephone number: ");
            String phone = input.next();
            System.out.println("\nPlease Enter Account information below");
            int accountType = getAccountType();
            System.out.print("Account Number: ");
            long accountNumber = input.nextLong();
            System.out.print("Account balance: ");
            double balance = input.nextDouble();

            // Initialize account object
            Account account;

            // Initialize client object
            Client client;

            if (accountType  == 1) {
                // Initialize account object
                account = new Account(accountNumber, balance);
                if (clientType == 1) {
                    // Initialize client object
                    client = new Client(name, id, address, phone, account);
                }
                else {
                    client = new CommercialClient(name, id, address, phone, account);
                }
                bank.addClient(client);
            }
            else {
                account = new SpecialAccount(accountNumber, balance);
                if (clientType == 1) {
                    // Initialize client object
                    client = new Client(name, id, address, phone, account);
                }
                else {
                    client = new CommercialClient(name, id, address, phone, account);
                }
                bank.addClient(client);
            }
            displayMenu();
        }
        else if (choice == 2){
            bank.displayClient();
            displayMenu();
        }
        else {
            System.exit(0);
        }
    }

    private static int getAccountType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Account Type");
        System.out.println("1. Normal Account\n" +
                "2. Special Account");
        System.out.print("Your choice: ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Wrong Choice!");
            System.out.print("Your choice: ");
            choice = input.nextInt();
        }
        return choice;
    }

    private static int getClientType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Client Type");
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
