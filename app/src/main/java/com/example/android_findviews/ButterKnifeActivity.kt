package com.example.android_findviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id._btn_search)lateinit var b_butter: Button
    @BindView(R.id.tv_butter)lateinit var tv_butter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)
        initView()
    }

    private fun initView() {
        b_butter.setOnClickListener {
            tv_butter.text = "Butter knife"
        }
    }
}