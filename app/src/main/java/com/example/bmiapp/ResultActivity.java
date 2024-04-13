package com.example.bmiapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float heightValue = getIntent().getFloatExtra("h", 0);
        float weightValue = getIntent().getFloatExtra("w", 0);
        float age = getIntent().getIntExtra("age", 0);
        boolean isMale = getIntent().getBooleanExtra("isMale", true);

        float bmi = weightValue / ((heightValue / 100) * (heightValue / 100));

        double calories = 0;
        if (isMale) {
            calories = 66.5 + 13.75 * weightValue + 5.003 * heightValue - 6.775 * age;
        } else {
            calories = 655.1 + (9.563 * weightValue) + (1.85 * heightValue) - (4.676 * age);
        }

        TextView bmiTxt = findViewById(R.id.bmiTxt);
        bmiTxt.setText(bmi + "");

        TextView caloriesTxt = findViewById(R.id.caloriesTxt);
        caloriesTxt.setText(calories + "");

        String feed = "";
        if (bmi < 16) {
            feed = "Mięso, warzywa, kasze, ryż";
        } else if (bmi < 18.5) {
            feed = "Mięso, warzywa, kasze";
        } else if (bmi < 25) {
            feed = "Warzywa, owoce, wędliny";
        } else if (bmi < 30) {
            feed = "Dużo wody, warzywa, produkty mało przetworzone, aktywność fizyczna";
        } else {
            feed = "Dużo wody, warzywa, produkty mało przetworzone, zacznij się ruszać(najlepiej rowerek stacjonarny), nie podjadaj wieczorem";
        }
        TextView feedTxt = findViewById(R.id.feedTxt);
        feedTxt.setText(feed);
    }

}
