package com.example.educonvalen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val idNumberEditText = findViewById<EditText>(R.id.idNumberEditText)
        val birthDateEditText = findViewById<EditText>(R.id.birthDateEditText)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val idNumber = idNumberEditText.text.toString()
            val birthDate = birthDateEditText.text.toString()


            val intent = Intent(this, CareersActivity::class.java).apply {
                putExtra("NAME", name)
                putExtra("ID_NUMBER", idNumber)
                putExtra("BIRTH_DATE", birthDate)
            }
            startActivity(intent)
        }
    }
}
