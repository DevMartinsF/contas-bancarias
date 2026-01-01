package com.bank.model;

import java.util.UUID;

public class Client {
    private final UUID id;
    private String name;
    private String email;

    public Client(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }
}
