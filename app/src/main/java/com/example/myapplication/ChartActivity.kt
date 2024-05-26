package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class ChartActivity : AppCompatActivity() {

    private lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        lineChart = findViewById(R.id.lineChart)

        drawMockBmiChart()
    }

    private fun drawMockBmiChart() {
        val entries = ArrayList<Entry>()


        val mockData = listOf(18.5f, 19.0f, 20.5f, 21.5f, 22.0f, 24.0f, 25.0f, 23.5f, 22.5f, 21.0f)
        for (i in mockData.indices) {
            entries.add(Entry(i.toFloat(), mockData[i]))
        }

        val lineDataSet = LineDataSet(entries, "BMI over time")
        val lineData = LineData(lineDataSet)
        lineChart.data = lineData
        lineChart.invalidate() // Refresh the chart
    }
}
