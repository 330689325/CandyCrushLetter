package com.example.processor;

public class Stage1Strategy  implements ProcessingStrategy {
    @Override
    public String process(String input) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = input.length();
        boolean modified = false;

        while (i < n) {
            int j = i + 1;
            while (j < n && input.charAt(j) == input.charAt(i)) {
                j++;
            }
            int count = j - i;
            if (count >= 3) {
                modified = true;
            } else {
                sb.append(input, i, j);
            }
            i = j;
        }

        String result = sb.toString();
        if (modified) {
            System.out.println("-> " + result);
            return process(result);
        } else {
            return result;
        }
    }
}
