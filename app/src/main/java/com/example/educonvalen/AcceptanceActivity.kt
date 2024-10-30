package com.example.educonvalen

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class AcceptanceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceptance)

        val name = intent.getStringExtra("NAME")
        val idNumber = intent.getStringExtra("ID_NUMBER")
        val birthDate = intent.getStringExtra("BIRTH_DATE")

        val acceptanceTextView = findViewById<TextView>(R.id.acceptanceTextView)
        acceptanceTextView.text = "Nombre: $name\nCédula: $idNumber\nFecha de Nacimiento: $birthDate"
    }
}