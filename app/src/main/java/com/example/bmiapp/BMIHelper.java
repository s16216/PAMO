package com.example.bmiapp;

public class BMIHelper {

    public float calculateBMI(float height, float weight) {
        return weight / ((height / 100) * (height / 100));
    }
}
