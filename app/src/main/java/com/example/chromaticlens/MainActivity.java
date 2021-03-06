package com.example.chromaticlens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when the user taps the "get started" button
    public void onClick(View view) {
        getStarted();
    }

    public void getStarted() {
        Intent intent = new Intent(this, Screen2.class);
        startActivity(intent);
    }
}