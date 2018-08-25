package com.liviurau.bibapp.jokes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_INTENT = "extra_intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if(getIntent() == null || !getIntent().hasExtra(EXTRA_INTENT)){
            finish();
            return;
        }

        TextView jokeTextView = findViewById(R.id.jokeTextView);
        jokeTextView.setText(getIntent().getStringExtra(EXTRA_INTENT));
    }
}
