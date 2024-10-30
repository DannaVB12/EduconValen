package com.example.educonvalen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val nameInput: EditText = findViewById(R.id.nameInput)
        val acceptTerms: CheckBox = findViewById(R.id.acceptTerms)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val intent = Intent(this, AcceptanceActivity::class.java).apply {
                putExtra("name", nameInput.text.toString())
                putExtra("accepted", acceptTerms.isChecked)
            }
            startActivity(intent)
        }
    }
}
