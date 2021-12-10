package com.bzh.test

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import org.junit.Assert
import org.junit.Test

class BZHTest {

    @Test
    fun bzhtest() {
        // https://github.com/android/android-test/issues/1199
        val scenario = ActivityScenario.launch(BZHActivityTest::class.java)
        Assert.assertEquals(Activity.RESULT_OK, scenario.result.resultCode)
    }
}