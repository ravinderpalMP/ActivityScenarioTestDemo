package com.bzh.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import com.bzh.test.test.R

class BZHActivityTest : AppCompatActivity() {

    var testRootView: LinearLayoutCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        testRootView = findViewById<LinearLayoutCompat>(R.id.test_root)
    }
}