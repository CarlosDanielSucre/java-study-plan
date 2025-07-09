package org.example.ex01;

public class BankAccount {


    private int number;
    private double balance;
    private AccountType accountType;

    public BankAccount(int number, AccountType accountType) {
        this.number = number;
        this.accountType = accountType;
        this.balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void deposit(double value) {
        if(value <= 0){
            System.out.println("You cannot deposit an amount equal to or less than zero.");
        }else {
            setBalance(value + getBalance());
        }
    }

    public void withdraw (double value) {
        if(getBalance() < value){
            System.out.println("You cannot withdraw more money than you have in your account.");
        }else {
            setBalance(getBalance() - value);
        }
    }
    @Override
    public String toString() {
        return "Account #" + number + " | Type: " + accountType + " | Balance: $" + balance;
    }
}
