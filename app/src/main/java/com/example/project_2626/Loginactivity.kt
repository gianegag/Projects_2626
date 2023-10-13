package com.example.project_2626

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Loginactivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        //intent explisit
        //instance
        val btnLogin:Button= findViewById(R.id.buttonLogin)
        val textUsername:EditText = findViewById(R.id.editTextUser)
        val textPassword:EditText = findViewById(R.id.editTextpassword)
        val loginmodel = LoginModel()
        //even btn Login Click
        btnLogin.setOnClickListener {
            //input
            loginmodel.username =  textUsername.text.toString()
            loginmodel.password = textPassword.text.toString()
            //validate
            if (loginmodel.logincheck() == true) {
                //callhome activity
                val intentHome = Intent(this, HomeActivity2::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this,
                        "Неправильное Имя пользователя / Пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}