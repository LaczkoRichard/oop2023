package oop.labor02;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' + '}';
    }

    public void deposit(double amount){
        //setBalance(this.balance + amount);
        if(amount>0) this.balance += amount;
        else System.out.println("IDIOT... Learn to deposit...");
    }

    public boolean withdraw(double amount){
        //setBalance(this.balance - amount);
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}