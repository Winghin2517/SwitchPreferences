package com.example.switchpreferences;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestPreferenceFragment testPreferenceFragment = new TestPreferenceFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, testPreferenceFragment).commit();
    }
}
