package com.example.activityscenariotestdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.activityscenariotestdemo.test.R

class TestActivity : AppCompatActivity() {

    var testRootView: LinearLayoutCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        testRootView = findViewById<LinearLayoutCompat>(R.id.test_root)
    }
}