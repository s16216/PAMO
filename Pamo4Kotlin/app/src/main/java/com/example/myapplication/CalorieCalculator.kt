package com.example.myapplication

class CalorieCalculator {
    fun calculateCalories(weight: Float, height: Float, age: Float, isMale: Boolean): Double {
        return if (isMale) {
            66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age)
        } else {
            655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age)
        }
    }
}
