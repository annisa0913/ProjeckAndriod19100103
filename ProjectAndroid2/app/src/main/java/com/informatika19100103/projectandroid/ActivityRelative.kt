package com.informatika19100103.projectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityRelative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)
        button5.setOnClickListener{
            val i = Inten ( packageContext: this, activityrelativelayout::class.java)

        }
    }
}