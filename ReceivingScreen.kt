package com.kymysteries.android.adam_login_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.EditText



class ReceivingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiving_screen)

        //below will receive the data from 1st activity
        val intent = Intent(this@ReceivingScreen,MainActivity::class.java)
        val emailAddress = intent.getStringExtra("useremail")
        val userpw = intent.getStringExtra("userpassword")
        val userName = intent.getStringExtra("username")
        val userWebsite = intent.getStringExtra("userwebsite")

        //enter user name in edit text field
        val nameUser = findViewById(R.id.editTextTextPersonName) as EditText
        nameUser.setText("Hello" + userName)
        //enter user email in edit text field
        val userEmail = findViewById(R.id.emailAddressEditText) as EditText
        nameUser.setText(userName)
        //enter user website in edit text field
        val websiteOfUser = findViewById(R.id.userWebsiteEntered) as EditText
        nameUser.setText(userName)



    }
}