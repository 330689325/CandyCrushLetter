package com.example.processor;

public class Stage2Strategy  implements ProcessingStrategy {
    @Override
    public String process(String input) {
        int n = input.length();
        for (int i = 0; i < n; ) {
            int j = i + 1;
            while (j < n && input.charAt(j) == input.charAt(i)) {
                j++;
            }
            int count = j - i;
            if (count >= 3) {
                char current = input.charAt(i);
                char replacement = (current > 'a') ? (char) (current - 1) : 0;
                String newStr;
                String replacedPart = input.substring(i, j);
                if (replacement >= 'a') {
                    newStr = input.substring(0, i) + replacement + input.substring(j);
                } else {
                    newStr = input.substring(0, i) + input.substring(j);
                }
                String replacementStr = replacement >= 'a' ? String.valueOf(replacement) : "";
                System.out.println("-> " + newStr + ", " + replacedPart + " is replaced by " + replacementStr);
                return process(newStr);
            }
            i = j;
        }
        return input;
    }
}
