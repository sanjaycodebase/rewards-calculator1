package com.example.rewards_calculator.repository;

import com.example.rewards_calculator.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    // You can add custom queries if necessary
}
