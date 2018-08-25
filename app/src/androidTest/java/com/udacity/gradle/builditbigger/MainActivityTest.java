package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    private static final String TAG = MainActivityTest.class.getSimpleName();
    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void executeGCEAsyncTask_returnString() {
        try {
            String result = new GCEAsyncTask(mRule.getActivity()).execute().get();
            Log.i(TAG, result);

            Assert.assertTrue(!result.isEmpty());
        } catch (InterruptedException e) {
            Log.e(TAG, e.getMessage());
        } catch (ExecutionException e) {
            Log.e(TAG, e.getMessage());
        }
    }

}