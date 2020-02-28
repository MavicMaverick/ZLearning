/*
 * Copyright (c) 2019 RoBro Tech. All rights reserved.
 *
 * RoBro Tech is the Developer Company of Rohan Mathew.
 *
 * Project: SpyTransmit (HappyBirthday Prank)
 * File Name: ExampleInstrumentedTest.java
 * Last Modified: 18/05/19 09:36
 */

package com.RoBroTech.Dev.HappyBirthday_SpyTransmitPrank;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.RoBroTech.Dev.HappyBirthday_SpyTransmitPrank", appContext.getPackageName());
    }
}
