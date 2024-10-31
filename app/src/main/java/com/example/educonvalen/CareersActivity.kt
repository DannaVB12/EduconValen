package com.example.educonvalen

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class CareersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_careers)

        val exitButton = findViewById<Button>(R.id.exitButton)
        val nameTextView = findViewById<TextView>(R.id.nameTextView)


        val name = intent.getStringExtra("NAME") ?: "Usuario"
        nameTextView.text = "Bienvenido, $name"


        val careersTextView = findViewById<TextView>(R.id.careersTextView)
        careersTextView.text = """
            LAS MEJORES CARRERAS DISPONIBLES PARA TI SON:
            
            
            1. Ingeniería de Software
            2. Psicología
            3. Administración de Empresas
            4. Medicina
        """.trimIndent()

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}
