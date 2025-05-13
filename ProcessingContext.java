package com.example.processor;

public class ProcessingContext {
    private ProcessingStrategy strategy;

    public ProcessingContext(ProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String input) {
        return strategy.process(input);
    }
}
