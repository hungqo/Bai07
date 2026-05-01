package com.example.bai07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        logger.info("Add result: {}", calculator.add(10, 5));
        logger.info("Subtract result: {}", calculator.subtract(10, 5));
        logger.info("Divide result: {}", calculator.divide(10, 5));
    }
}