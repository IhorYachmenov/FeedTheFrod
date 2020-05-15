package com.example.feedthefrod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FeedTheFrogMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedthefrog_main_activity);

        getSupportActionBar().hide();
    }
}
