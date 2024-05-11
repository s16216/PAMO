package com.example.myapplication

class BMIHelper {
    fun calculateBMI(height: Float, weight: Float): Float {
        return weight / ((height / 100) * (height / 100))
    }
}
