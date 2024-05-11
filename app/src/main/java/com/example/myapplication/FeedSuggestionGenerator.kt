package com.example.myapplication


class FeedSuggestionGenerator {
    fun generateFeed(bmi: Float): String {
        return when {
            bmi < 16 -> "Mięso, warzywa, kasze, ryż"
            bmi < 18.5 -> "Mięso, warzywa, kasze"
            bmi < 25 -> "Warzywa, owoce, wędliny"
            bmi < 30 -> "Dużo wody, warzywa, produkty mało przetworzone, aktywność fizyczna"
            else -> "Dużo wody, dieta niskokaloryczna, regularne badania"
        }
    }
}
