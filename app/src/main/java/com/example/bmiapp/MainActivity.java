package com.example.bmiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText height, weight, age;
    private RadioGroup genderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        age = findViewById(R.id.age);
        genderView = findViewById(R.id.genderView);
    }

    public void calculateBMI(View view) {
        String value1 = height.getText().toString();
        String value2 = weight.getText().toString();

        float heightValue = Float.parseFloat(value1);
        float weightValue = Float.parseFloat(value2);
        int ageValue = Integer.parseInt(age.getText().toString());

        boolean isMale = genderView.getCheckedRadioButtonId() == R.id.genderMale;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("h", heightValue);
        intent.putExtra("w", weightValue);
        intent.putExtra("isMale", isMale);
        intent.putExtra("age", ageValue);
        startActivity(intent);
    }
}
