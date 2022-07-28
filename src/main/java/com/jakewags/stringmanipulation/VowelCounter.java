package com.jakewags.stringmanipulation;

public class VowelCounter {
    public static int numVowels(String s) {
        if (s == null) return -1;

        // a e i o u
        String vowels = "aeiou";
        char[] charArr = s.toCharArray();
        int vowelCounter = 0;

        for (char c : charArr) {
            if (vowels.indexOf(c) >= 0) vowelCounter++;
        }

        return vowelCounter;
    }
}
