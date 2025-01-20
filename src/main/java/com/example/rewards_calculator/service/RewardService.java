package com.example.rewards_calculator.service;

import com.example.rewards_calculator.entity.Transaction;  // Updated import statement
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class RewardService {

    public RewardService() {
        // Initializing some sample transactions (replace with actual business logic)
        List<Transaction> transactions = Arrays.asList(new Transaction("Type1", LocalDate.now(), 100), new Transaction("Type2", LocalDate.now(), 200));


        // Just for demonstration, printing out the transactions
        transactions.forEach(System.out::println);
    }

    // Add more methods for reward calculations and other business logic here

}
