package com.example.sushant.taptapwin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button player11;
    private Button player12;
    private Button player21;
    private Button player22;
    private TextView player1Score, player2Score;
    private int fontSize = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewElements();

    }

    private void getViewElements(){

        player11 = (Button)findViewById(R.id.player1);
        player11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePlayer1Tap();
            }
        });
        player12 = (Button)findViewById(R.id.player1B2);
        player12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePlayer1Tap();
            }
        });

        player22 = (Button)findViewById(R.id.player2);
        player22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePlayer2Tap();
            }
        });
        player21 = (Button)findViewById(R.id.player2B2);
        player21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePlayer2Tap();
            }
        });

        player1Score = (TextView) findViewById(R.id.player1_score);
        player1Score.setTextColor(getResources().getColor(R.color.red,null));

        player2Score = (TextView) findViewById(R.id.player2_score);
        player2Score.setTextColor(getResources().getColor(R.color.blue,null));
        resetGame();
    }

    private void handlePlayer1Tap() {

        String p1Score = (String) player1Score.getText();
        int p1 = Integer.parseInt(p1Score);
        player1Score.setText(Integer.toString(--p1));
        checkWinner();
        Log.d("MainActivity", "handlePlayer1Tap: handlePlayer1Tap"+p1Score+" "+p1);
    }

    private void handlePlayer2Tap() {

        String p2Score = (String) player2Score.getText();
        int p2 = Integer.parseInt(p2Score);

        player2Score.setText(Integer.toString(--p2));
        checkWinner();
        Log.d("MainActivity", "handlePlayer1Tap: handlePlayer2Tap"+" "+p2);
    }

    private void checkWinner() {

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                Log.d("AlertDialog","AlertDialog");
//            }
//        });

//        AlertDialog dialog = builder.create();
//
//        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
//
//            public void onCancel(DialogInterface dialog) {
//                Log.d("setOnCancelListener","onCancel");
//            }
//        });
//        dialog.show();

        String p1Score = (String) player1Score.getText();
        int p1 = Integer.parseInt(p1Score);

        String p2Score = (String) player2Score.getText();
        int p2 = Integer.parseInt(p2Score);

        if (p1 == 0){
            Toast.makeText(this, R.string.player2_won,
                    Toast.LENGTH_LONG).show();
            resetGame();
        } else if(p2 == 0){
            Toast.makeText(this, R.string.player1_won,
                    Toast.LENGTH_LONG).show();
            resetGame();
        }
    }

    private void resetGame() {
        player1Score.setText("10");
        player2Score.setText("10");
    }
}
