class BankAccount {
    // Static members
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    private static int accountCounter = 1;

    // Instance members
    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for "
                + accountHolderName + " with initial balance: $" + initialBalance);
    }

    // Static method to generate unique account numbers
    private static String generateAccountNumber() {
        String num = Integer.toString(accountCounter);
        while (num.length() < 3) {   
            num = "0" + num;
        }
        accountCounter++;
        return "ACC" + num;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    // Calculate interest
    public double calculateInterest() {
        return balance * interestRate;
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}
