import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create account objects
        Account savingsAccount = new SavingsAccount("Trina", 1000.00);
        Account checkingAccount = new CheckingAccount("Lena", 150.00);

        // Welcome screen
        System.out.println("===========================");
        System.out.println("||   Bank Application    ||");
        System.out.println("===========================");

        // Menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\n 1. Deposit");
            System.out.println(" 2. Withdraw");
            System.out.println(" 3. View Customer");
            System.out.println(" 4. Add Interest (Savings Account)");
            System.out.println(" 5. Exit");

            System.out.print("\nEnter your choice : ");
            String choice = scanner.nextLine();

            try {
                int option = Integer.parseInt(choice);

                switch (option) {
                    case 1:
                        handleDeposit(scanner, savingsAccount, checkingAccount);
                        break;
                    case 2:
                        handleWithdrawal(scanner, savingsAccount, checkingAccount);
                        break;
                    case 3:
                        System.out.println();
                        System.out.println(savingsAccount.toString());
                        System.out.println(checkingAccount.toString());
                        break;
                    case 4:
                        handleAddInterest(scanner, (SavingsAccount) savingsAccount);
                        break;
                    case 5:
                        exit = true;
                        System.out.println("\n============================================");
                        System.out.println("|| Thank you for using Bank Application!  ||");
                        System.out.println("============================================");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        scanner.close();
    }

    private static void handleDeposit(Scanner scanner, Account savingsAccount, Account checkingAccount) {
        try {
            System.out.print("Enter account type (1 for Savings, 2 for Checking): ");
            int accountType = Integer.parseInt(scanner.nextLine());

            if (accountType != 1 && accountType != 2) {
                throw new IllegalArgumentException("Invalid account type.");
            }

            System.out.print("Enter deposit amount: ");
            double depositAmount = Double.parseDouble(scanner.nextLine());
            if (depositAmount < 0) throw new IllegalArgumentException("Negative value entered.");

            if (accountType == 1) {
                boolean result = savingsAccount.deposit(depositAmount);
                System.out.println("Transaction status: " + (result ? "True" : "False"));
            } else if (accountType == 2) {
                boolean result = checkingAccount.deposit(depositAmount);
                System.out.println("Transaction status: " + (result ? "True" : "False"));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleWithdrawal(Scanner scanner, Account savingsAccount, Account checkingAccount) {
        try {
            System.out.print("Enter account type (1 for Savings, 2 for Checking): ");
            int accountType = Integer.parseInt(scanner.nextLine());

            if (accountType != 1 && accountType != 2) {
                throw new IllegalArgumentException("Invalid account type.");
            }

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = Double.parseDouble(scanner.nextLine());
            if (withdrawalAmount < 0) throw new IllegalArgumentException("Negative value entered.");

            if (accountType == 1) {
                boolean result = savingsAccount.withdraw(withdrawalAmount);
                System.out.println("Transaction status: " + (result ? "True" : "False SavingsAccount requires a minimum of £10 in the account at any time."));
            } else if (accountType == 2) {
                boolean result = checkingAccount.withdraw(withdrawalAmount);
                System.out.println("Transaction status: " + (result ? "True" : "False"));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleAddInterest(Scanner scanner, SavingsAccount savingsAccount) {
        try {
            double newBalance = savingsAccount.addInterest();
            System.out.println("New balance after adding interest: " + newBalance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}