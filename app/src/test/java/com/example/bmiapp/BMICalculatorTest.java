package com.example.bmiapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        BMIHelper helper = new BMIHelper();
        float bmi = helper.calculateBMI(180, 70);
        assertEquals(21.6f, bmi, 0.01);
    }

    @Test
    public void testGenerateFeed() {
        FeedSuggestionGenerator generator = new FeedSuggestionGenerator();
        String feed = generator.generateFeed(26);
        assertEquals("Dużo wody, warzywa, produkty mało przetworzone, aktywność fizyczna", feed);
    }
}
