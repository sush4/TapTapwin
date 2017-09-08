package com.example.sushant.taptapwin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View player1 = findViewById(R.id.player1);
        View player2 = findViewById(R.id.player2);
    }
}
