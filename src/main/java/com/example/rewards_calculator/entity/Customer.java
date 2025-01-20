package com.example.rewards_calculator.entity;

import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Transaction> transactions;

    public Customer(String customerId, String name, List<Transaction> transactions) {
        this.customerId = customerId;
        this.name = name;
        this.transactions = transactions;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
