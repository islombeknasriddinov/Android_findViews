package com.example.android_findviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val b_butterKnife = findViewById<Button>(R.id.b_butterknife)
        val b_kotlin_synthetics = findViewById<Button>(R.id.b_kotlin_synthetics)
        val b_view_binding = findViewById<Button>(R.id.b_view_binding)

        b_butterKnife.setOnClickListener {
            callButterKnifeActivity()
        }

        b_kotlin_synthetics.setOnClickListener {
            callKotlinSyntheticsActivity()
        }

        b_view_binding.setOnClickListener {
            callViewBinding()
        }
    }

    private fun callViewBinding() {
        var intent = Intent(this,ViewBindingActivity::class.java)
        startActivity(intent)
    }

    private fun callKotlinSyntheticsActivity() {
        var intent = Intent(this,KotlinSyntheticsActivity::class.java)
        startActivity(intent)
    }

    private fun callButterKnifeActivity() {
        var intent = Intent(this,ButterKnifeActivity::class.java)
        startActivity(intent)
    }


}