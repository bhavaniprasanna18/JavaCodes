package BankData;

//File: com/bankapp/BankAccount.java

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
 private String accountNumber;
 private String accountHolderName;
 private double balance;
 private List<Transaction> transactions;

 public BankAccount(String accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
     this.transactions = new ArrayList<>();
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolderName() {
     return accountHolderName;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         transactions.add(new Transaction("Deposit", amount, balance));
         System.out.println("Deposit successful. New balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         transactions.add(new Transaction("Withdrawal", amount, balance));
         System.out.println("Withdrawal successful. New balance: " + balance);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance.");
     }
 }

 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder Name: " + accountHolderName);
     System.out.println("Balance: " + balance);
 }

 public void displayTransactions() {
     if (transactions.isEmpty()) {
         System.out.println("No transactions found.");
     } else {
         for (Transaction transaction : transactions) {
             System.out.println(transaction);
         }
     }
 }
}
