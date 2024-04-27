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

        BMIHelper helper = new BMIHelper();
        float bmi = helper.calculateBMI(heightValue, weightValue);

        CalorieCalculator calculator = new CalorieCalculator();
        double calories = calculator.calculateCalories(weightValue, heightValue, age, isMale);

        TextView bmiTxt = findViewById(R.id.bmiTxt);
        bmiTxt.setText(bmi + "");

        TextView caloriesTxt = findViewById(R.id.caloriesTxt);
        caloriesTxt.setText(calories + "");

        FeedSuggestionGenerator generator = new FeedSuggestionGenerator();
        String feed = generator.generateFeed(bmi);

        TextView feedTxt = findViewById(R.id.feedTxt);
        feedTxt.setText(feed);
    }
}
