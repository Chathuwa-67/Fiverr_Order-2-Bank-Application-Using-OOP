class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 10.00;
    private static final double MONTHLY_INTEREST_RATE = 0.25;

    public SavingsAccount(String id, double initialDeposit) {
        super(id, initialDeposit);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public double addInterest() {
        double interest = (balance * MONTHLY_INTEREST_RATE) / 100;
        balance += interest;
        return balance;
    }
}
