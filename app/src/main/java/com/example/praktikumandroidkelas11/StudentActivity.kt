package com.example.praktikumandroidkelas11

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.praktikumandroid11.R

class StudentActivity : AppCompatActivity{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val etStudent :EditText! = findViewById<EditText>(R.id.etIdStudent)
        val etNameStudent :EditText! = findViewById<EditText>(R.id.etNameStudent)
        val etPhoneNumberStudent :EditText! = findViewById<EditText>(R.id.PhoneNumberStudent)
        val btSave :Button! = findViewById<Button>(R.id.btSaveStudent)
        val btDial :Button! = findViewById<Button>(R.id.btDialStudent)

        btSave.setOnClickListener { it:View!
            val id :String = etIdStuden.text.toString()
            val name :String = etNameStudent.text.toString()
            val phoneNumber :String = etPhoneNumberStudent.text.toString()

            val i = intent( packageContent: this,ResultActivity::class.java)
            i.putExtra(ResultActivity.EXTRA_ID,id)
            i.putExtra(ResultActivity.EXTRA_NAME,name)
            i.putExtra(ResultActivity.EXTRA_PHONE_NUMBER,phoneNumber)

            StartActivity(i)
        }

        btDial.setOnClickListener{ it.View!
            val phoneNumber :String = etPhoneNumberStudent.text.toString()
            val i = Intent(Intent.ACTION_DIAL, Uri.parsel(uriString: "tel:$phoneNumber"))
            startActivity(i)
        }
    }
} 