package BankData;

//File: com/bankapp/Transaction.java


import java.util.Date;

public class Transaction {
 private Date date;
 private String type;
 private double amount;
 private double balanceAfter;

 public Transaction(String type, double amount, double balanceAfter) {
     this.date = new Date();
     this.type = type;
     this.amount = amount;
     this.balanceAfter = balanceAfter;
 }

 @Override
 public String toString() {
     return "Date: " + date + ", Type: " + type + ", Amount: " + amount + ", Balance After: " + balanceAfter;
 }
}
