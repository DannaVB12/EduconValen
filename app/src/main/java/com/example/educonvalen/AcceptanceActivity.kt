package com.example.educonvalen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class AcceptanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceptance)

        val name = intent.getStringExtra("name")
        val accepted = intent.getBooleanExtra("accepted", false)

        val resultText: TextView = findViewById(R.id.resultText)
        resultText.text = "Nombre: $name\nAceptó términos: ${if (accepted) "Sí" else "No"}"

        val exitButton: Button = findViewById(R.id.exitButton)
        exitButton.setOnClickListener {
            finishAffinity() // Cierra todas las actividades y sale de la app
        }
    }
}