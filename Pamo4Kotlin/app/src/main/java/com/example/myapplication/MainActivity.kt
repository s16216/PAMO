package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var height: EditText
    private lateinit var weight: EditText
    private lateinit var age: EditText
    private lateinit var genderView: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        height = findViewById(R.id.height)
        weight = findViewById(R.id.weight)
        age = findViewById(R.id.age)
        genderView = findViewById(R.id.genderView)
    }

    fun calculateBMI(view: View?) {
        val value1 = height.text.toString()
        val value2 = weight.text.toString()

        val heightValue = value1.toFloat()
        val weightValue = value2.toFloat()
        val ageValue = age.text.toString().toInt()

        val isMale = genderView.checkedRadioButtonId == R.id.genderMale

        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("h", heightValue)
        intent.putExtra("w", weightValue)
        intent.putExtra("isMale", isMale)
        intent.putExtra("age", ageValue)
        startActivity(intent)
    }
}
