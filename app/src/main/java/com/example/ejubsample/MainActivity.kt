package com.example.ejubsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.ejubsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var myQuote: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        binding.showQuoteBtn.setOnClickListener {
            myQuote = binding.enterSomethingEditText.text.toString()
            Toast.makeText(this, myQuote, Toast.LENGTH_SHORT).show()
        }

        binding.openNewActivityBtn.setOnClickListener {
            val intent = Intent(this, NewEjoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}