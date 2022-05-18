package com.kymysteries.android.adam_login_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.kymysteries.android.adam_login_test.databinding.ActivityMainBinding




class MainActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     lateinit var emailText: EditText
     lateinit var passwordText: EditText
     lateinit var userName: EditText
     lateinit var websiteText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button: Button = findViewById(R.id.button_submit)

        //get inputted user data
        userName = findViewById(R.id.firstNameEditText) as EditText
        emailText = findViewById(R.id.emailTextView) as EditText
        passwordText = findViewById(R.id.passwordEditText) as EditText
        websiteText = findViewById(R.id.websiteEditText) as EditText
        //set onclick to check for null or empty in email and password
        button.setOnClickListener{
            if (TextUtils.isEmpty(emailText.toString()) && TextUtils.isEmpty(passwordText.toString())) {
                Toast.makeText(this, "Please enter email address and password", Toast.LENGTH_LONG).show()
            } else {
                //get the user data and send to second activity
                val intent = Intent(this, ReceivingScreen::class.java).apply {
                    intent.putExtra("username",userName.text.toString())
                    intent.putExtra("useremail", emailText.text.toString())
                    intent.putExtra("userpassword", passwordText.text.toString())
                    intent.putExtra("userwebsite", websiteText.text.toString())
                    startActivity(intent)
                }
            }
        }
    }




}



//val intent = Intent(this@MainActivity, ReceivingScreen::class.java)
//var email_address = emailTextView.text
//startActivity(intent)