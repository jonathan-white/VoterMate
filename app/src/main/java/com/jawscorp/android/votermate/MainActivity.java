package com.jawscorp.android.votermate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View federal = findViewById(R.id.federal_button);

        federal.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), VoteActivity.class);
            intent.putExtra("EXTRA_TEXT","Federal");
            startActivity(intent);
        });

        View state = findViewById(R.id.state_button);
        federal.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), VoteActivity.class);
            intent.putExtra("EXTRA_TEXT","State");
            startActivity(intent);
        });

        View local = findViewById(R.id.local_button);
        federal.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), VoteActivity.class);
            intent.putExtra("EXTRA_TEXT","Local");
            startActivity(intent);
        });
    }
}