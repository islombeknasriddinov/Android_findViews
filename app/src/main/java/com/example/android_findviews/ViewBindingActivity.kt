package com.example.android_findviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.android_findviews.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    lateinit var bindingActivity: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivity = ActivityViewBindingBinding.inflate(LayoutInflater.from(this))
        setContentView(bindingActivity.root)
        initView()
    }

    private fun initView() {
        bindingActivity.btnViewBinding.setOnClickListener {
            bindingActivity.tvViewBinding.text = "View Binding"
        }
    }
}