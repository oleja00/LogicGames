package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.digits;

import android.content.pm.ActivityInfo;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.kitsyambochka.logicgames.R;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class DigitMainActivity extends AppCompatActivity {
    private Button buttonStart;
    private Chronometer chronometer;
    private Button[] buttons;

    private int minimize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        buttonStart = (Button) findViewById(R.id.buttonStart);


        chronometer = (Chronometer) findViewById(R.id.chronometer);


        buttons = new Button[20];


        buttons[0] = (Button) findViewById(R.id.button1);
        buttons[1] = (Button) findViewById(R.id.button2);
        buttons[2] = (Button) findViewById(R.id.button3);
        buttons[3] = (Button) findViewById(R.id.button4);
        buttons[4] = (Button) findViewById(R.id.button5);
        buttons[5] = (Button) findViewById(R.id.button6);
        buttons[6] = (Button) findViewById(R.id.button7);
        buttons[7] = (Button) findViewById(R.id.button8);
        buttons[8] = (Button) findViewById(R.id.button9);
        buttons[9] = (Button) findViewById(R.id.button10);
        buttons[10] = (Button) findViewById(R.id.button11);
        buttons[11] = (Button) findViewById(R.id.button12);
        buttons[12] = (Button) findViewById(R.id.button13);
        buttons[13] = (Button) findViewById(R.id.button14);
        buttons[14] = (Button) findViewById(R.id.button15);
        buttons[15] = (Button) findViewById(R.id.button16);
        buttons[16] = (Button) findViewById(R.id.button17);
        buttons[17] = (Button) findViewById(R.id.button18);
        buttons[18] = (Button) findViewById(R.id.button19);
        buttons[19] = (Button) findViewById(R.id.button20);

        for(int i = 0; i<buttons.length; i++){
            buttons[i].setBackgroundResource(R.drawable.normbut);
        }



        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();

                createNiceButton();

                FillButton fillButton = new FillButton(buttons);
                fillButton.showButton();
            }
        });

        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(0);
            }
        });

        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(1);
            }
        });

        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(2);
            }
        });

        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(3);
            }
        });

        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(4);
            }
        });

        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(5);
            }
        });

        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(6);
            }
        });

        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(7);
            }
        });

        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(8);
            }
        });

        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(9);
            }
        });

        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(10);
            }
        });

        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(11);
            }
        });

        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(12);
            }
        });

        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(13);
            }
        });

        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(14);
            }
        });

        buttons[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(15);
            }
        });

        buttons[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(16);
            }
        });

        buttons[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(17);
            }
        });

        buttons[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(18);
            }
        });

        buttons[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameMethod(19);
            }
        });
    }

    public void gameMethod(int num)
    {
        Game game = new Game(num, buttons, minimize);
        game.changeButton();
        minimize = game.getMinimize();

        EndChecker endChecker = new EndChecker(buttons);

        if (endChecker.endGame()) {

            String thisRecord = chronometer.getText().toString();
            chronometer.stop();

            Toast.makeText(DigitMainActivity.this, getString(R.string.your_time)+thisRecord,Toast.LENGTH_SHORT).show();

        }

    }

    public void createNiceButton(){
        for(int i = 0; i<buttons.length; i++){
            buttons[i].setBackgroundResource(R.drawable.normbut);
            buttons[i].setEnabled(true);
            buttons[i].setVisibility(View.VISIBLE);
            minimize = 0;
        }
    }
}
