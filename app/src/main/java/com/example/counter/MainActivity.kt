package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun countCrown(view: View) {
        var counterCrown: String
        var tvCounterCrown: TextView
        tvCounterCrown = findViewById(R.id.tvCounterCrown)
        counterCrown = tvCounterCrown.text.toString()
        var btnCounterInt: Int = Integer.parseInt(counterCrown)
        btnCounterInt++
        tvCounterCrown.text = btnCounterInt.toString()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var counterCrown: String
        var tvCounterCrown: TextView
        tvCounterCrown = findViewById(R.id.tvCounterCrown)
        counterCrown = tvCounterCrown.text.toString()
        outState?.run {
            putString("COUNT",counterCrown)
        }
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var tvCounterCrown: TextView
        tvCounterCrown = findViewById(R.id.tvCounterCrown)
        tvCounterCrown.text = savedInstanceState?.getString("COUNT")
    }
}