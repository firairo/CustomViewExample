package com.lexshi.customviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.lexshi.customviewexample.ui.AvatarImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_border = findViewById<Button>(R.id.btn_border)
        val btn_color = findViewById<Button>(R.id.btn_color)
        val aiv = findViewById<AvatarImageView>(R.id.aiv)

        btn_border.setOnClickListener {
            aiv.setBorderWidth((2..10).random())
        }

        btn_color.setOnClickListener {
            aiv.setBorderColor((AvatarImageView.bgColors).random())
        }
    }
}