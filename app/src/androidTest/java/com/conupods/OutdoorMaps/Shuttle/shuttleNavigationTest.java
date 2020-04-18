package com.conupods.OutdoorMaps.Shuttle;

import android.util.Utility;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

import com.conupods.MapsActivity;
import com.conupods.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class shuttleNavigationTest {

    private static final String TAG = "TEST_SHUTTLE";
    private UiDevice mDevice;

    @Rule
    public ActivityTestRule<MapsActivity> activityRule
            = new ActivityTestRule<>(MapsActivity.class);

    @Before
    public void setUpEach() {
        Utility.turnOnDeviceLocation(TAG);
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void shuttleNagivatonTest(){

        onView(ViewMatchers.withId(R.id.searchBar)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.recycler_view)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.get_directions_btn)).perform(click());
        onView(ViewMatchers.withId(R.id.modeSelect_shuttleTimes)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void drivingNagivatonTest(){

        onView(ViewMatchers.withId(R.id.searchBar)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.recycler_view)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.get_directions_btn)).perform(click());
        onView(ViewMatchers.withId(R.id.modeSelect_drivingButton)).perform(click());
    }

    @Test
    public void transitNagivatonTest(){

        onView(ViewMatchers.withId(R.id.searchBar)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.recycler_view)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.get_directions_btn)).perform(click());
        onView(ViewMatchers.withId(R.id.modeSelect_transitButton)).perform(click());
    }

    @Test
    public void walkingNagivatonTest(){

        onView(ViewMatchers.withId(R.id.searchBar)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.recycler_view)).perform(click()).check(matches(isDisplayed()));
        onView(ViewMatchers.withId(R.id.get_directions_btn)).perform(click());
        onView(ViewMatchers.withId(R.id.modeSelect_walkingButton)).perform(click());
    }
}
