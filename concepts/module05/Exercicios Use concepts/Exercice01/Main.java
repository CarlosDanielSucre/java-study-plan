package org.example.ex01;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, AccountType.CHECKING_ACCOUNT);
        account.deposit(200);
        account.withdraw(50);

        Client client = new Client("Carlos", "712.876.234-65", account);
        System.out.println(client.toString());

    }
}
