package Client;

import Account.Account;
/**
 * This represents Client with attributes name, nationalID, address, phone and account
 * @author Kangana Alain 20160318
 * @version 1.0
 */
public class Client {
    private String name;
    private String nationalID;
    private  String address;
    private String phone;
    private Account account;

    /**
     * Constructs a new Client with params:
     * @param name client's name
     * @param nationalID client's national ID
     * @param address client's address
     * @param phone client's telephone number
     * @param account client's account
     */
    public Client(String name, String nationalID, String address, String phone, Account account) {
        setName(name);
        setNationalID(nationalID);
        setAddress(address);
        setPhone(phone);
        setAccount(account);
    }

    /**
     * Sets name
     * @param name client's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets nationalID
     * @param nationalID client's national ID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * Sets Address
     * @param address client's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets telephone number
     * @param phone client's telephone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets account
     * @param account client's account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Returns name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns nationalID
     * @return nationalID
     */
    public String getID() {
        return nationalID;
    }

    /**
     * Returns address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Return telephone number
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns account
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Returns Client information
     * @return a string representation of client
     */
    @Override
    public String toString() {
        return "\nClient Type: " + getClass().getSimpleName() +
                "\nName: " + getName() +
                "\nNational ID: " + getID() +
                "\nAddress: " + getAddress() +
                "\nTelephone Number: " + getPhone();
    }
}
