package com.example.processor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stage2StrategyTest {
    @Test
    public void testStage2Example() {
        ProcessingStrategy strategy = new Stage2Strategy();
        String result = strategy.process("abcccbad");
        assertEquals("d", result);
    }

    @Test
    public void testReplacementToA() {
        ProcessingStrategy strategy = new Stage2Strategy();
        String result = strategy.process("bbba");
        assertEquals("aa", result);
    }

    @Test
    public void testReplacementToEmpty() {
        ProcessingStrategy strategy = new Stage2Strategy();
        String result = strategy.process("aaad");
        assertEquals("d", result);
    }
}
