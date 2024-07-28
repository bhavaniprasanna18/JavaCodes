package BankData;

import java.util.Scanner;
//File: com/bankapp/BankingApplication.java

public class BankApplication {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = null;
     boolean quit = false;

     while (!quit) {
         System.out.println("Welcome to the Banking Application");
         System.out.println("1. Create a New Account");
         System.out.println("2. Display Account Information");
         System.out.println("3. Deposit Money");
         System.out.println("4. Withdraw Money");
         System.out.println("5. View Transaction History");
         System.out.println("6. Quit");
         System.out.print("Please choose an option: ");
         
         int choice = scanner.nextInt();
         scanner.nextLine(); // consume the newline character

         switch (choice) {
             case 1:
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.nextLine();
                 System.out.print("Enter account holder name: ");
                 String accountHolderName = scanner.nextLine();
                 System.out.print("Enter initial balance: ");
                 double initialBalance = scanner.nextDouble();
                 account = new BankAccount(accountNumber, accountHolderName, initialBalance);
                 System.out.println("Account created successfully.");
                 break;
             case 2:
                 if (account != null) {
                     account.displayAccountInfo();
                 } else {
                     System.out.println("No account found. Please create an account first.");
                 }
                 break;
             case 3:
                 if (account != null) {
                     System.out.print("Enter amount to deposit: ");
                     double depositAmount = scanner.nextDouble();
                     account.deposit(depositAmount);
                 } else {
                     System.out.println("No account found. Please create an account first.");
                 }
                 break;
             case 4:
                 if (account != null) {
                     System.out.print("Enter amount to withdraw: ");
                     double withdrawAmount = scanner.nextDouble();
                     account.withdraw(withdrawAmount);
                 } else {
                     System.out.println("No account found. Please create an account first.");
                 }
                 break;
             case 5:
                 if (account != null) {
                     account.displayTransactions();
                 } else {
                     System.out.println("No account found. Please create an account first.");
                 }
                 break;
             case 6:
                 quit = true;
                 System.out.println("Thank you for using the Banking Application. Goodbye!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
         System.out.println();
     }

     scanner.close();
 }
}
