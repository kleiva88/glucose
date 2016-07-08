package com.github.daemontus.glucose

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.test.ActivityInstrumentationTestCase2
import com.glucose.AndroidConsoleLogger
import com.glucose.Log
import com.glucose.device.Units
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UnitsTest : ActivityInstrumentationTestCase2<ColorActivity>(ColorActivity::class.java) {

    companion object {
        init {
            Log.loggers += AndroidConsoleLogger()
        }
    }

    @Before
    fun init() {
        injectInstrumentation(InstrumentationRegistry.getInstrumentation())
    }

    @Test
    fun dpToPx() {
        Log.i("10dp is ${Units.dpToPx(activity, 10f)}px")
    }

    @Test
    fun pxToDp() {
        Log.i("10px is ${Units.pxToDp(activity, 10f)}dp")
    }

}