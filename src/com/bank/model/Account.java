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
}
