package Account;

/**
 * This represents Account with two attributes: account_number and balance
 * @author Ntajugumba Guy Cherubin
 * @version 1.00 2021/04/22
 */
public class Account {
    private long account_number;
    private double balance;

    /**
     * Constructs an new Account with account number and balance
     * and assigns them to the new Account
     * @param account_number account number of the client
     * @param balance initial balance of the client
     */
    public Account(long account_number, double balance) {
        setAccountNumber(account_number);
        setBalance(balance);
    }

    /**
     * Returns the account number
     * @return account_number
     */
    public long getAccountNumber() {
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
    public void setAccountNumber(long account_number) {
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
                "\nBalance=: " + getBalance() + " LE\n\n";
    }

    /**
     * Withdraws given balance from account
     * @param balance balance to be withdrawn
     */
    public void withdraw(double balance) {
        if (balance > this.balance) {
            System.out.println("Sorry! Not enough balance!");
        }
        else {
            this.balance -= balance;
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
