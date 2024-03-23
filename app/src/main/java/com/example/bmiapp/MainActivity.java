package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height, weight;
    TextView resulText;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        resulText = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
        String value1 = height.getText().toString();
        String value2 = weight.getText().toString();

        float heightValue = Float.parseFloat(value1);
        float weightValue = Float.parseFloat(value2);

        float BMI = weightValue / ((heightValue/100) * (heightValue/100));

        if(BMI < 16){
            BMIresult = "Start eating";
        } else if(BMI < 18.5){
            BMIresult = "Underweight";
        } else if(BMI < 25){
            BMIresult = "Normal Weight";
        } else if(BMI < 30){
            BMIresult = "You are too FAT!";
        } else {
            BMIresult = "Stop eating!";
        }

        calculation = "Result:\n\n" + BMI + "\n" + BMIresult;
        resulText.setText(calculation);
    }
}