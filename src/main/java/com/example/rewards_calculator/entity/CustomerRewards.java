package com.example.rewards_calculator.entity;

import java.util.List;

public class CustomerRewards {
    private String customerId;
    private String customerName;
    private List<Transaction> transactions;
    private int totalRewards;

    public CustomerRewards(String customerId, String customerName, List<Transaction> transactions, int totalRewards) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.transactions = transactions;
        this.totalRewards = totalRewards;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getTotalRewards() {
        return totalRewards;
    }
}
