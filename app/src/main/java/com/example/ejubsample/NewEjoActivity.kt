package com.example.ejubsample

import android.app.PendingIntent.getActivity
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.ejubsample.databinding.ActivityNewEjoBinding
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class NewEjoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewEjoBinding
    private var myNumber : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new_ejo)
    }

    override fun onResume() {
        super.onResume()
        binding.button3.setOnClickListener {
            myNumber = binding.newText.text.toString()

            if (myNumber.equals("1")) {
                binding.newEjoConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.oneColor))
            }
            else if (myNumber.equals("2")) {
                binding.newEjoConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.twoColor))
            }
            else if (myNumber.equals("3")) {
                binding.newEjoConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.threeColor))

            }

        }

        lifecycleScope.launch(Default) {
            val myString = "Superman"
            val myList = mutableListOf(1,2,3,4,5,6,7,8,9,10)

            for (i in myList) {
                Log.d("EJOO", myString)
            }
            val myTruth = true

            while (myTruth) {
                Log.d("EJOO", "ISTINA")
            }
        }







    }
}