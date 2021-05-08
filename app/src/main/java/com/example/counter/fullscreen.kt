package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class fullscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)
        showCountOnScreen()
    }
    private fun showCountOnScreen(){
        var count : String? = intent.getStringExtra("count")
        val tvFullScreenCounter: TextView = findViewById(R.id.tvFullScreenCounter)
        tvFullScreenCounter.text = count
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var counterCrown: String
        var tvCounterCrown: TextView
        tvCounterCrown = findViewById(R.id.tvFullScreenCounter)
        counterCrown = tvCounterCrown.text.toString()
        outState?.run {
            putString("COUNT",counterCrown)
        }
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var tvCounterCrown: TextView = findViewById(R.id.tvFullScreenCounter)
        tvCounterCrown.text = savedInstanceState?.getString("COUNT")
    }
}