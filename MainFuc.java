package com.example.processor;

public class MainFuc {
    public static void main(String[] args) {
        String input1 = "aabcccbbad";
        System.out.println("Stage 1 Processing:");
        System.out.println("Input: " + input1);
        System.out.println("Output:");
        System.out.println("-> " + input1);
        ProcessingContext context = new ProcessingContext(new Stage1Strategy());
        context.executeStrategy(input1);

        String input2 = "abcccbad";
        System.out.println("\nStage 2 Processing:");
        System.out.println("Input: " + input2);
        System.out.println("Output:");
        System.out.println("-> " + input2);
        context = new ProcessingContext(new Stage2Strategy());
        context.executeStrategy(input2);
    }
}
