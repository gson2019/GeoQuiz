package com.example.bubble.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueBtn.setOnClickListener {
            Toast.makeText(this, "True clicked", Toast.LENGTH_SHORT).show();
        }
        falseBtn.setOnClickListener {
            Toast.makeText(this, "False clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
