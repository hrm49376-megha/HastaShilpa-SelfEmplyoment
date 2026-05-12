package com.example.hastashilpa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Launches the Price Calculator
        val materialBtn = findViewById<Button>(R.id.btnMaterial)
        materialBtn.setOnClickListener {
            startActivity(Intent(this, MaterialActivity::class.java))
        }

        // Launches the Blueprint Viewer
        val blueprintBtn = findViewById<Button>(R.id.blueprintBtn)
        blueprintBtn.setOnClickListener {
            startActivity(Intent(this, BlueprintActivity::class.java))
        }

        // Launches the Marketplace Activity (formerly opened browser)
        val marketplaceBtn = findViewById<Button>(R.id.btnMarketplace)
        marketplaceBtn.setOnClickListener {
            startActivity(Intent(this, MarketplaceActivity::class.java))
        }
        
        // Note: TrackerActivity is currently registered but not yet linked to a button.
        // You can add a button for it in activity_main.xml when needed.
    }
}
