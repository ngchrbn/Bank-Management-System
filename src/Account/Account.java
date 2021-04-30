package Account;

/**
 * This represents Account with two attributes: account_number and balance
 * @author Ntajugumba Guy Cherubin
 * @version 1.0
 */
public class Account {
    private String account_number;
    protected double balance;

    /**
     * Constructs an new Account with account number and balance
     * and assigns them to the new Account
     * @param account_number account number of the client
     * @param balance initial balance of the client
     */
    public Account(String account_number, double balance) {
        setAccountNumber(account_number);
        setBalance(balance);
    }

    /**
     * Returns the account number
     * @return account_number
     */
    public String getAccountNumber() {
        return account_number;
    }

    /**
     * Returns the balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the client's account number
     * @param account_number account number of the client
     */
    public void setAccountNumber(String account_number) {
        this.account_number = account_number;
    }

    /**
     * Sets the client's balance
     * @param balance : balance of the client
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns a representation of the account
     * @return representation of the account
     */
    @Override
    public String toString() {
        return "\nAccount Type: " + getClass().getSimpleName() +
                "\nAccount Number: " + getAccountNumber() +
                "\nBalance: " + getBalance() + " LE\n";
    }

    /**
     * Withdraws given balance from account
     * @param balance balance to be withdrawn
     */
    public void withdraw(double balance) {
        if (balance < 0) {
            System.out.println("\n==>Negative Balance can't be withdrawn!");
        } else {
            if (balance > this.balance) {
                System.out.println("\n==>Sorry! Not enough balance!");
            }
            else {
                this.balance -= balance;
                System.out.printf("%.2fLE has been withdrawn from the account%n", balance);
            }
        }
    }

    /**
     * Deposits given balance into account
     * @param balance balance to be deposited
     */
    public void deposit(double balance) {
        this.balance += balance;
    }
}
