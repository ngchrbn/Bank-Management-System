package Bank;

import Account.Account;
import Client.Client;
import java.util.ArrayList;

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
            counter = 0;
        }
    }
}
