package com.example.rewards_calculator.controller;

import com.example.rewards_calculator.entity.CustomerRewards;
import com.example.rewards_calculator.service.RewardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {

    private static final Logger logger = LoggerFactory.getLogger(RewardController.class);
    private final RewardService rewardService;

    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<?> calculateRewards(@RequestParam("customerId") String customerId,
                                              @RequestParam("startDate") String startDate,
                                              @RequestParam("endDate") String endDate) {
        try {
            LocalDate start = LocalDate.parse(startDate);
            LocalDate end = LocalDate.parse(endDate);

            if (end.isBefore(start)) {
                return ResponseEntity.badRequest().body("End date cannot be before start date.");
            }

            CustomerRewards customerRewards = rewardService.calculateRewards(customerId, start, end);
            return ResponseEntity.ok(customerRewards);
        } catch (DateTimeParseException e) {
            logger.error("Invalid date format provided", e);
            return ResponseEntity.badRequest().body("Invalid date format. Use YYYY-MM-DD.");
        } catch (Exception e) {
            logger.error("Error calculating rewards", e);
            return ResponseEntity.status(500).body("An error occurred while processing the request.");
        }
    }
}
