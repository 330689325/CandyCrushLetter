package com.example.processor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stage1StrategyTest {
    @Test
    public void testStage1Example() {
        ProcessingStrategy strategy = new Stage1Strategy();
        String result = strategy.process("aabcccbbad");
        assertEquals("d", result);
    }

    @Test
    public void testNoChanges() {
        ProcessingStrategy strategy = new Stage1Strategy();
        String result = strategy.process("abc");
        assertEquals("abc", result);
    }

    @Test
    public void testMultiplePasses() {
        ProcessingStrategy strategy = new Stage1Strategy();
        String result = strategy.process("aaaa");
        assertEquals("", result);
    }
}
