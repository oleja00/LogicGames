package com.kitsyambochka.logicgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Button bTicTacToe;
    private Button bTwentyFour;
    private Button bDigits;
    private Button bBarleyBreak;
    private Button bPuzzle;

    private int ticTacToeNumber = 1;
    private int makeTwentyFour = 2;
    private int digits = 3;
    private int barleyBreak = 4;
    private int puzzle = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTicTacToe = (Button)findViewById(R.id.buttonTicTacToe);
        bTwentyFour = (Button)findViewById(R.id.buttonTwentyFour);
        bDigits = (Button)findViewById(R.id.buttonDigits);
        bBarleyBreak = (Button)findViewById(R.id.buttonBarleyBreak);
        bPuzzle = (Button)findViewById(R.id.buttonPuzzle);

        intent = new Intent(MainActivity.this, RulesActivity.class);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.buttonTicTacToe:
                        intent.putExtra("GAME_NUMBER", ticTacToeNumber);
                        startActivity(intent);
                        break;
                    case R.id.buttonTwentyFour:
                        intent.putExtra("GAME_NUMBER", makeTwentyFour);
                        startActivity(intent);
                        break;
                    case R.id.buttonDigits:
                        intent.putExtra("GAME_NUMBER", digits);
                        startActivity(intent);
                        break;
                    case R.id.buttonBarleyBreak:
                        intent.putExtra("GAME_NUMBER", barleyBreak);
                        startActivity(intent);
                        break;
                    case R.id.buttonPuzzle:
                        intent.putExtra("GAME_NUMBER", puzzle);
                        startActivity(intent);
                        break;
                }
            }
        };

        bTicTacToe.setOnClickListener(onClickListener);
        bTwentyFour.setOnClickListener(onClickListener);
        bDigits.setOnClickListener(onClickListener);
        bBarleyBreak.setOnClickListener(onClickListener);
        bPuzzle.setOnClickListener(onClickListener);
    }
}
