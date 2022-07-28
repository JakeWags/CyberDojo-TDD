package com.jakewags.stringmanipulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    @Test
    @DisplayName("Testing the number of vowels")
    void vowelCount() {
        // a e i o u
        String one = "There ten vowels in this sentence!";
        assertEquals(10, VowelCounter.numVowels(one));

        String two = "12eeee121213ruass";
        assertEquals(6, VowelCounter.numVowels(two));

        String three = "";
        assertEquals(0, VowelCounter.numVowels(three));

        String four = null;
        assertEquals(-1, VowelCounter.numVowels(four));
    }

}