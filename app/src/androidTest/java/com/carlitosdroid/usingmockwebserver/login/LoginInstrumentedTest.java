package com.carlitosdroid.usingmockwebserver.login;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.carlitosdroid.usingmockwebserver.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import java.io.IOException;

import okhttp3.mockwebserver.MockWebServer;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 3/30/17.
 */

@RunWith(AndroidJUnit4.class)
public class LoginInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, false);
    private MockWebServer mockWebServer;
    @Before
    public void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
    }



}
