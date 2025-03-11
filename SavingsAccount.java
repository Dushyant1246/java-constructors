class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public variable
        System.out.println("Account Holder: " + accountHolder); // Accessing protected variable
        System.out.println("Balance: $" + super.getBalance()); // Accessing private balance via getter
    }
}