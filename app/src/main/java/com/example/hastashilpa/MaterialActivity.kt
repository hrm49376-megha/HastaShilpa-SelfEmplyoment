package com.example.hastashilpa

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MaterialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)

        val etBamboo = findViewById<EditText>(R.id.etBamboo)
        val etHours = findViewById<EditText>(R.id.etHours)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val bamboo = etBamboo.text.toString().toIntOrNull() ?: 0
            val hours = etHours.text.toString().toIntOrNull() ?: 0

            val total = (bamboo * 20) + (hours * 30)

            tvResult.text = getString(R.string.suggested_price, total)
        }
    }
}