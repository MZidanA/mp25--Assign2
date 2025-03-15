package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHidden: Button = findViewById(R.id.btnHidden)

        btnHidden.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
    }

    fun handleClick(view: View) {
        val input: EditText = findViewById(R.id.inputText)
        val name: String = input.text.toString()

        val result: TextView = findViewById(R.id.tvResult)
        result.text = "Halo, selamat bergabung $name!!"

        // Menampilkan tombol yang awalnya tersembunyi
        val btnHidden: Button = findViewById(R.id.btnHidden)
        btnHidden.visibility = View.VISIBLE
    }

}
