package Bank;

import Account.Account;
import Client.Client;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This represents Bank with attributes: name, address and phone
 * @author Ntajugumba Guy Cherubin
 * @version 1.00 2021/04/22
 */
public class Bank {
    private String name;
    private String address;
    private String phone;
    private final ArrayList<Account> accounts = new ArrayList<>();
    private final ArrayList<Client> clients = new ArrayList<>();

    /**
     * Constructs a new Bank with params:
     * @param name bank's name
     * @param address bank's address
     * @param phone bank's telephone number
     */
    public Bank(String name, String address, String phone) {
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    /**
     * Sets name
     * @param name bank's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets Address
     * @param address bank's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets Telephone Number
     * @param phone bank's telephone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns Address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns Telephone Number
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Adds a new client(normal or commercial client)
     * @param client Client(or CommercialClient) object
     */
    public void addClient(Client client) {
        clients.add(client);
        accounts.add(client.getAccount());
    }

    /**
     * Displays existing clients
     */
    public void displayClient() {
        if (clients.size() == 0) {
            System.out.println("Empty!");
        }
        else {
            int counter = 0;
            for (Client client :
                    clients) {
                ++counter;
                System.out.println("\nClient #" + counter);
                System.out.println("\nClient Information");
                System.out.println(client);
                System.out.println("\nAccount Information");
                System.out.println(accounts.get(counter-1));
            }
        }
    }

    public void signIn(String clientID) {
        if (!clientExists(clientID)) {
            System.out.print("Account Number Not Found!");
        } else {
            Scanner input = new Scanner(System.in);
            int clientIndex = getClientIndex(clientID);
            System.out.println("1. Deposit\n" +
                    "2. Withdraw");
            System.out.print("Your choice (1 - 2): ");
            int choice = input.nextInt();
            while (choice != 1 && choice != 2) {
                System.out.println("Wrong Choice!");
                System.out.print("Your choice (1 - 2): ");
                choice = input.nextInt();
            }
            if (choice == 1) {
                System.out.print("Enter Amount to deposit: ");
                double amount = input.nextDouble();
                accounts.get(clientIndex).deposit(amount);
                System.out.printf("%dLE has been deposit to your account successfully", amount);
            }
        }
    }

    /**
     * Get a client index from clients ArrayList
     * @param clientID client's identification
     * @return client's index in clients
     */
    private int getClientIndex(String clientID) {
        int clientIndex = 0;
        for (int i=0; i< clients.size(); ++i) {
            if (clients.get(i).getID().equals(clientID)) {
                clientIndex = i;
                break;
            }
        }
        return clientIndex;
    }

    /**
     * Checks if a given client identification exists in clients ArrayList
     * @param clientID client's identification
     * @return true if found, otherwise false
     */
    private boolean clientExists(String clientID) {
        boolean found = false;
        for (Client client : clients) {
            if (client.getID().equals(clientID)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
