package com.kitsyambochka.logicgames;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.barleybreak.BarleyBreakActivity;
import com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.digits.DigitMainActivity;
import com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.puzzle.PuzzleActivity;

public class RulesActivity extends AppCompatActivity {

    private TextView tvRules;
    private Button bPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        tvRules = (TextView)findViewById(R.id.textViewRules);
        bPlay = (Button)findViewById(R.id.buttonPlay);

        switch (getIntent().getIntExtra("GAME_NUMBER", 0)){
            case 1:
                setRulesText(getString(R.string.tic_tac_toe_rules));
                break;
            case 2:
                setRulesText(getString(R.string.twenty_four_rules));
                break;
            case 3:
                setRulesText(getString(R.string.digits_rules));
                break;
            case 4:
                setRulesText(getString(R.string.barley_break_rules));
                break;
            case 5:
                setRulesText(getString(R.string.puzzle_rules));
                break;
        }

        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (getIntent().getIntExtra("GAME_NUMBER", 0)){
                    case 1:
                        intent = new Intent(RulesActivity.this, TicTacToe.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(RulesActivity.this, TwentyFour.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(RulesActivity.this, DigitMainActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(RulesActivity.this, BarleyBreakActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(RulesActivity.this, PuzzleActivity.class);
                        startActivity(intent);
                        break;
                }

            }
        });


    }

    public void setRulesText(String rules){
        tvRules.setText(rules);
    }
}
