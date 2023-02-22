package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart= findViewById<Button>(R.id.btnstart)
        val EdNom = findViewById<EditText>(R.id.EdNom)


        btnStart.setOnClickListener{
          if (EdNom.text.trim().isEmpty()){
             Toast.makeText(this,"Veuillez entrer votre nom",Toast.LENGTH_LONG).show()
        }else{
            val intent= Intent(this,QuizQuestionActivity::class.java)

              startActivity(intent)

              finish()
          }
        }
        }
    }
