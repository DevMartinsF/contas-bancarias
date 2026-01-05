package com.bank.model;

import java.util.UUID;

public class Account  {
    private final UUID accountNumber;
    private double balance;
    private String accountType;
    private Client client;

    public Account(double balance, String accountType, Client client) {
        this.accountNumber=UUID.randomUUID();
        this.balance = balance;
        this.accountType = accountType;
        this.client = client;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
