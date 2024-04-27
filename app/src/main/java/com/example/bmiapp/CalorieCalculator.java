package com.example.bmiapp;

public class CalorieCalculator {

    public double calculateCalories(float weight, float height, float age, boolean isMale) {
        if (isMale) {
            return 66.5 + 13.75 * weight + 5.003 * height - 6.775 * age;
        } else {
            return 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        }
    }
}
