package org.example.ex01;

public class Client {

    private BankAccount bankAccount;

    private String name;
    private String cpf;

    public Client (String name, String cpf, BankAccount bankAccount){
        this.bankAccount = bankAccount;
        this.name = name;
        this.cpf  = cpf;
    }
@Override
    public String toString(){
        return "Name: " + name + ", CPF " + cpf + bankAccount.toString();
    }
}
