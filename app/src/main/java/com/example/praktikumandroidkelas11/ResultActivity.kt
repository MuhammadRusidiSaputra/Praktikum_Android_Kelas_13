package com.example.praktikumandroidkelas11

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity {

    companion object{
        const val EXTRA_ID = "id_student"
        const val EXTRA_NAME = "name_student"
        const val EXTRA_PHONE_NUMBER = "phone_number_student"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.Layout.activity_result)

        val tvIdResult :TextView = findViewById<TextView>(R.id.tvIdResult)
        val tvNameResult :TextView = findViewById<TextView>(R.id.tvNameResult)
        val tvPhoneNumberResult :TextView = findViewById<TextView>(R.id.tvPhoneNumberResult)

        val id :String? = intent.getStringExtra(EXTRA_ID)
        val name :String? = intent.getStringExtra(EXTRA_NAME)
        val phoneNumber :String? = intent.getStringExtra(EXTRA_PHONE_NUMBER)

        tvIdResult.text = id
        tvNameResult.text = name
        tvPhoneNumberResult.text = phoneNumber
    }
}