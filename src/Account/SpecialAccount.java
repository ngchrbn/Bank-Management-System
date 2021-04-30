package Account;
/**
 * This represents SpecialAccount that allows over drafting
 * with maximum limit of 1000 LE. It is inherited from Account
 * @see Account
 * @author Ntajugumba Guy Cherubin 20160379
 * @version 1.0
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
     * Withdraws given balance from account with maximum over draft of 1000
     * @param amount balance to be withdrawn
     */
    @Override
    public void withdraw(double amount) {
        if (amount < 0)  {
            System.out.println("\n==>Negative amount can't be withdrawn!");
        } else {
            if (getBalance() == (-MAXIMUMDRAFT)) {
                System.out.println("\n==>Your balance is -1000LE. \n" +
                        "==>Deposit first to be able to withdraw");
            } else if (amount > getBalance()){
                if (-(-amount + getBalance()) > MAXIMUMDRAFT) {
                    System.out.println("\n==>Your are allowed only a maximum over draft of 1000LE");
                } else {
                    setBalance(this.balance -= amount);
                    System.out.printf("%.2fLE has been withdrawn from the account%n", amount);
                }
            } else {
                setBalance(this.balance -= amount);
                System.out.printf("%.2fLE has been withdrawn from the account%n", amount);
            }
        }
    }
}
