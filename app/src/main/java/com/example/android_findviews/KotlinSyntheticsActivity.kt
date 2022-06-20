package com.example.android_findviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin_synthetics.*

class KotlinSyntheticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthetics)
        initView()
    }

    private fun initView() {
        btn_synthetic.setOnClickListener {
            tv_synthetic.text = "Kotlin Synthetics"
        }
    }
}