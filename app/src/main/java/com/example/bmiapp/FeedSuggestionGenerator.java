package com.example.bmiapp;

public class FeedSuggestionGenerator {

    public String generateFeed(float bmi) {
        if (bmi < 16) {
            return "Mięso, warzywa, kasze, ryż";
        } else if (bmi < 18.5) {
            return "Mięso, warzywa, kasze";
        } else if (bmi < 25) {
            return "Warzywa, owoce, wędliny";
        } else if (bmi < 30) {
            return "Dużo wody, warzywa, produkty mało przetworzone, aktywność fizyczna";
        } else {
            return "Dużo wody, warzywa, produkty mało przetworzone, zacznij się ruszać(najlepiej rowerek stacjonarny), nie podjadaj wieczorem";
        }
    }
}
