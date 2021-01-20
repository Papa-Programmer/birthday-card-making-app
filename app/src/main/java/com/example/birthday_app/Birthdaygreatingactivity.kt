package com.example.birthday_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreatingactivity.*

class Birthdaygreatingactivity : AppCompatActivity() {

    companion object{
        const val Name_EXTRA ="name extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreatingactivity)

        val name = intent.getStringExtra(Name_EXTRA)
        birthdayGreeting.text = "Merry Christmas\n $name!"
    }
}