
Fiverr_Order-2-Bank-Application-Using-OOP
This repository contains the code and documentation for a simple bank application developed as part of the UFCFC3-30-1 resit coursework 1 for the Introduction to OO systems development module. The application is implemented in Java and includes three main classes: Account, SavingsAccount, and CheckingAccount. Additionally, there is a TestAccount class to demonstrate the functionality of the application.

Project Structure
Account.java: An abstract class representing a generic bank account.
SavingsAccount.java: A class that extends Account and represents a savings account with a minimum balance requirement.
CheckingAccount.java: A class that extends Account and represents a checking account with no interest.
TestAccount.java: A class containing a main method to test the functionalities of SavingsAccount and CheckingAccount.
UMLClassDiagram.pdf: A UML class diagram illustrating the relationships between the classes.
TestCases.pdf: A document detailing the test cases used to verify the functionality of the application.

Testing
Testing is an integral part of the development process. This project includes a detailed test strategy to ensure the application functions correctly. Refer to the TestCases.pdf document for the list of test cases and their results.

How to Run
Compile the Java files:
-javac Account.java SavingsAccount.java CheckingAccount.java TestAccount.java

Run the TestAccount class:
-java TestAccount

This project demonstrates the principles of object-oriented programming, including inheritance, encapsulation, and polymorphism, through a practical implementation of a banking system.
