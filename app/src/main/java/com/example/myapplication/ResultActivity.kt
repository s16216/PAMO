package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val heightValue = intent.getFloatExtra("h", 0f)
        val weightValue = intent.getFloatExtra("w", 0f)
        val age = intent.getIntExtra("age", 0).toFloat()
        val isMale = intent.getBooleanExtra("isMale", true)

        val helper = BMIHelper()
        val bmi = helper.calculateBMI(heightValue, weightValue)

        val calculator = CalorieCalculator()
        val calories = calculator.calculateCalories(weightValue, heightValue, age, isMale)

        val bmiTxt = findViewById<TextView>(R.id.bmiTxt)
        bmiTxt.text = bmi.toString() + ""

        val caloriesTxt = findViewById<TextView>(R.id.caloriesTxt)
        caloriesTxt.text = calories.toString() + ""

        val generator = FeedSuggestionGenerator()

        val feedRecipes = generator.generateFeed(bmi)

        val listView = findViewById<ListView>(R.id.recipeListView)
        val recipesList = feedRecipes.map { it.joinToString(", ") }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recipesList)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, position, _ ->
            // Handle click
        }
    }
}
