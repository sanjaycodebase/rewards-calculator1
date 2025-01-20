package com.example.rewards_calculator.controller;

import com.example.rewards_calculator.entity.Transaction;
import com.example.rewards_calculator.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    // POST endpoint to create a new transaction
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // GET endpoint to retrieve all transactions
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // GET endpoint to retrieve a specific transaction by ID
    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable String id) {
        return transactionRepository.findById(id).orElse(null);
    }
}
