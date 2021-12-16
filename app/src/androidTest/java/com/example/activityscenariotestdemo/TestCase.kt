package com.example.activityscenariotestdemo

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import org.junit.Assert
import org.junit.Test

class TestCase {

    @Test
    fun test() {
        // https://github.com/android/android-test/issues/1199
        val scenario = ActivityScenario.launch(TestActivity::class.java)
        Assert.assertEquals(Activity.RESULT_OK, scenario.result.resultCode)
    }
}