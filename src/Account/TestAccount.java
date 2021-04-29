package Account;


public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("52464548445698", 500);
        SpecialAccount specialAccount = new SpecialAccount("52665423125565", 2565);

        // Display accounts information
        System.out.println(account);
        System.out.println(specialAccount);

        // Deposit balance into accounts
        account.deposit(450);
        specialAccount.deposit(825);

        // Display accounts information
        System.out.println("\nAfter depositing 450 into Account and 825 into SpecialAccount");
        System.out.println(account);
        System.out.println(specialAccount);

        // Withdraw balance from accounts with errors
        account.withdraw(2000);
        specialAccount.withdraw(1400);

        // Withdraw balance from accounts without errors
        account.withdraw(450);
        specialAccount.withdraw(654);

        // Display accounts information
        System.out.println("\n After withdrawing 450 into Account and 654 into SpecialAccount");
        System.out.println(account);
        System.out.println(specialAccount);
    }
}
