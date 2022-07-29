package com.jakewags.stringmanipulation;

public class VowelCounter {
    public static int numVowels(String s) {
        if (s == null) return -1;

        // a e i o u
        String vowels = "aeiou";
        String[] splitArr = s.split(" ");
        int vowelCounter = 0;

        for (String st : splitArr) {
            char[] charArr = st.toCharArray();
            int counter = vowelCounter;
            for (char c : charArr) {
                if (vowels.indexOf(c) >= 0) vowelCounter++;
            }
            if (vowelCounter == counter) {
                for (char c : charArr) {
                    if (c == 'y') vowelCounter++;
                }
            }
        }

        return vowelCounter;
    }
}
