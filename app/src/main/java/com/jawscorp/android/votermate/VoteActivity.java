package com.jawscorp.android.votermate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        View yea_button = findViewById(R.id.yea_button);
        yea_button.setOnClickListener(v -> {
            Toast toast = Toast.makeText(getApplicationContext(), "You clicked Yea!", Toast.LENGTH_LONG);
            toast.show();
        });

        View nay_button = findViewById(R.id.nay_button);
        nay_button.setOnClickListener(v -> {
            Toast toast = Toast.makeText(getApplicationContext(), "You clicked Nay!", Toast.LENGTH_LONG);
            toast.show();
        });
    }
}