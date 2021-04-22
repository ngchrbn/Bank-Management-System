package Client;

import Account.Account;
/**
 * This represents CommercialClient with attributes
 * name, commercialID, address, phone and account
 * It represents a company. It inherits Client class
 * @see Client
 * @author Ntajugumba Guy Cherubin
 * @version 1.00 2021/04/22
 */
public class CommercialClient extends Client {
    private long commercialID;

    /**
     * Constructs a new CommercialClient with params:
     * @param name company's name
     * @param commercialID company's commercial ID
     * @param address company's address
     * @param phone company's telephone number
     * @param account company's account
     */
    public CommercialClient(String name, long commercialID, String address, String phone, Account account) {
        super(name, 00000000000000L, address, phone, account); // Calls Client Constructor
        setCommercialID(commercialID);
    }

    /**
     * Sets commercialID
     * @param commercialID company's commercial ID
     */
    public void setCommercialID(long commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * Gets commercialID
     * @return commercialID
     */
    public long getCommercialID() {
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
                "\nCommercial ID: " + getCommercialID() +
                "\nAddress: " + getAddress() +
                "\nTelephone Number: " + getPhone();
    }
}
