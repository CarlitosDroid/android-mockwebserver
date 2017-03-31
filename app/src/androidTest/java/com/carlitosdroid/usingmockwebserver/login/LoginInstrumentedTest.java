package com.carlitosdroid.usingmockwebserver.login;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.carlitosdroid.usingmockwebserver.MainActivity;
import com.carlitosdroid.usingmockwebserver.util.Constants;
import com.carlitosdroid.usingmockwebserver.util.FormatJsonUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 3/30/17.
 *
 */

@RunWith(AndroidJUnit4.class)
public class LoginInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, false);
    private MockWebServer mockWebServer;
    private Context context;

    @Before
    public void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
        Constants.BASE_URL = mockWebServer.url("/").toString();
        context = InstrumentationRegistry.getContext();
    }

    @Test
    public void testLogin200Response() throws Exception {
        String fileName = "login_200_ok_response.json";
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(FormatJsonUtils.getStringFromFile(context, fileName)));

        Intent intent = new Intent();
        activityTestRule.launchActivity(intent);
    }

    @Test
    public void testLogin303Response() throws Exception {
        String fileName = "login_303_not_authorized_response.json";
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(303)
                .setBody(FormatJsonUtils.getStringFromFile(context, fileName)));

        Intent intent = new Intent();
        activityTestRule.launchActivity(intent);
    }

    @Test
    public void testLogin404Response() throws Exception {
        String fileName = "login_404_not_found.json";
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(404)
                .setBody(FormatJsonUtils.getStringFromFile(context, fileName)));

        Intent intent = new Intent();
        activityTestRule.launchActivity(intent);
    }

    @After
    public void tearDown() throws Exception {
        mockWebServer.shutdown();
    }

}
