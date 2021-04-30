package Account;
/**
 * This represents SpecialAccount that allows over drafting
 * with maximum limit of 1000 LE. It is inherited from Account
 * @see Account
 * @author Ntajugumba Guy Cherubin
 * @version 1.00 2021/04/22
 */
public class SpecialAccount extends Account{

    private final int MAXIMUMDRAFT = 1000;
    /**
     * Constructs an new SpecialAccount with account number and balance
     * and assigns them to the new SpecialAccount
     * This Constructor calls Account class constructor
     * @param account_number account number of the client
     * @param balance initial balance of the client
     */
    public SpecialAccount(String account_number, double balance) {
        super(account_number, balance); // Calls Account constructor
    }

    /**
     * Withdraws given balance from account
     * @param balance balance to be withdrawn
     */
    @Override
    public void withdraw(double amount) {
        if (amount == (0-MAXIMUMDRAFT)) {
            System.out.println("Pay first the loan of 1000LE");
        } else if (amount > balance){
            if (amount > (amount + MAXIMUMDRAFT)) {
                System.out.println("Maximum Draft is 1000LE");
            } else {
                this.balance -= balance;
                System.out.println("Amount withdrawn successfully");
            }
        } else {
            this.balance -= balance;
        }
    }
}
