package Account;
/**
 * This represents SpecialAccount that allows over drafting
 * with maximum limit of 1000 LE. It is inherited from Account
 * @see Account
 * @author Ntajugumba Guy Cherubin
 * @version 1.00 2021/04/22
 */
public class SpecialAccount extends Account{
    /**
     * Constructs an new SpecialAccount with account number and balance
     * and assigns them to the new SpecialAccount
     * This Constructor calls Account class constructor
     * @param account_number account number of the client
     * @param balance initial balance of the client
     */
    public SpecialAccount(long account_number, double balance) {
        super(account_number, balance); // Calls Account constructor
    }

    /**
     * Withdraws given balance from account
     * @param balance balance to be withdrawn
     */
    @Override
    public void withdraw(double balance) {
        if (balance > getBalance()) {
            System.out.println("Sorry! Not enough balance!");
        }
        else if (balance > 1000) {
            System.out.println("Sorry! Maximum withdraw is 1000 L.E");
        }
        else {
            super.withdraw(balance);
        }
    }
}
