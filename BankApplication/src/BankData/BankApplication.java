package BankData;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a new bank account
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);

        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome to the Banking Application");
            System.out.println("1. Display Account Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Quit");
            System.out.print("Please choose an option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
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
