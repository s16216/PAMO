package com.example.bmiapp;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);
    

    @Test
    public void testBMIResultDisplayed1() {

        String testHeight = "180";
        String testWeight = "75";
        String testAge = "30";

        ActivityScenario.launch(MainActivity.class);

        Espresso.onView(ViewMatchers.withId(R.id.height)).perform(ViewActions.replaceText(testHeight));
        Espresso.onView(ViewMatchers.withId(R.id.weight)).perform(ViewActions.replaceText(testWeight));
        Espresso.onView(ViewMatchers.withId(R.id.age)).perform(ViewActions.replaceText(testAge));

        Espresso.onView(ViewMatchers.withId(R.id.genderMale)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.calculate)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withText("Error")).check(ViewAssertions.doesNotExist());
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.bmiapp", appContext.getPackageName());
    }

}