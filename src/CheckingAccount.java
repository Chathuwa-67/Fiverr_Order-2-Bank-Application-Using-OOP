public class CheckingAccount extends Account {
    public CheckingAccount(String id, double initialDeposit) {
        super(id, initialDeposit);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
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
}
