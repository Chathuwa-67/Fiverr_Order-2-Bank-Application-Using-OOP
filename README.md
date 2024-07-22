# Fiverr_Order-2-Bank-Application-Using-OOP
UFCFC3-30-1-resit coursework 1 Introduction to OO systems development
You will draw a UML class diagram and develop a simple bank
application containing three classes Account, SavingsAccount,
and CheckingAccount .
Specifications for each Java class are given below:

Account class is an abstract class.
List of attributes:
protected String id;
protected double balance;
Constructor:
public Account(String id, double balance)
List of methods:
public String getID()
// Returns the account id.
public double getBalance()
// Returns the current balance.
public String toString()
// Returns a string that contains the id and balance. For example, if the id is
"Trina" and balance is "1300.50", the string returned is as follows:
ID: Trina, Balance: 1300.50
public abstract boolean withdraw(double amount)
public abstract boolean deposit(double amount)
SavingsAccount class extends Account.
A SavingsAccount requires a minimum of £10 in the account at any time.
List of attributes:
No new attributes are needed.
Constructor:
public SavingsAccount(String id, double initialDeposit)
//You must call super to use the code of the Account superclass.
List of methods:
public boolean withdraw(double amount)
//Implement the abstract method that you have declared in the Account
abstract class. A withdrawal that potentially lowers the balance below £10 is
not allowed. The balance remains unchanged but the method returns false. If
the withdrawal succeeds, the method returns true.
public boolean deposit(double amount)
//Implement the abstract method that you have declared in the Account
abstract class. The provided amount, must be positive, is added to the account.
The balance remains unchanged but the method returns false if the deposited
amount is invalid. If the deposit succeeds, the method returns true.
public double addInterest(double rate)
//Interest calculation formula
interest = (balance*rate_in_percent)/100
For example, if the monthly rate of interest is 0.25%, and the balance is
£1000, then the interest is £2.5, and the new balance becomes £1002.5
(1000*0.25)/100 + 1000 = 1002.5
You can use the the monthly rate of interest as a constant.
CheckingAccount class extends Account.
This account does not give any interest. Account balance can be non-negative,
i.e., either positive or zero.
List of attributes:
No new attributes are needed.
Constructor:
public CheckingAccount(String id, double initialDeposit)
//You must call super to use the code of the Account superclass.
List of methods:
public boolean withdraw(double amount)
//Implement the abstract method that you have declared in the Account
abstract class. Similar to SavingsAccount, but account balanace limit is zero.
public boolean deposit(double amount)
//Implement the abstract method that you have declared in the Account
abstract class. Similar to SavingsAccount.
TestAccount class
Here is a sample main method for the TestAccount class. However, remember
that it does not test all the methods or various situations.
public static void main(String[] args) {

 Account a1 = new SavingsAccount("Trina", 105.00);
 Account a2 = new CheckingAccount("Lena", 150.00);

 boolean result = a1.withdraw(30.00);
 System.out.println(result);
 result = a2.deposit(50.00);
 System.out.println(result);

 System.out.println(a1.toString());
 System.out.println(a2.toString());
 }
Testing is typically a part of the program development – you should
use a test strategy to test your program thoroughly. You may refer to
Step 4 of Part 2 in Practical 2 in Semester 1, identify appropriate test
cases for the above classes, write and document them in the form of a
table along with the UML class design file.
