package Client;

import Account.Account;
/**
 * This represents CommercialClient with attributes
 * name, commercialID, address, phone and account
 * It represents a company. It inherits Client class
 * @see Client
 * @author Kangana Alain 20160318
 * @version 1.0
 */
public class CommercialClient extends Client {
    private String commercialID;

    /**
     * Constructs a new CommercialClient with params:
     * @param name company's name
     * @param commercialID company's commercial ID
     * @param address company's address
     * @param phone company's telephone number
     * @param account company's account
     */
    public CommercialClient(String name, String commercialID, String address, String phone, Account account) {
        super(name, "00000000000000", address, phone, account); // Calls Client Constructor
        setCommercialID(commercialID);
    }

    /**
     * Sets commercialID
     * @param commercialID company's commercial ID
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * Gets commercialID
     * @return commercialID
     */
    public String getID() {
        return commercialID;
    }

    /**
     * Returns commercial client info
     * @return a string representation of a company
     */
    @Override
    public String toString() {
        return "\nClient Type: CommercialClient" +
                "\nName: " + getName() +
                "\nCommercial ID: " + getID() +
                "\nAddress: " + getAddress() +
                "\nTelephone Number: " + getPhone();
    }
}
