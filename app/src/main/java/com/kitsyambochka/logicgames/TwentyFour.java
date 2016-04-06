package com.kitsyambochka.logicgames;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwentyFour extends AppCompatActivity {
    private TextView textViewShow;
    private TextView textViewResult;
    private Button one;
    private Button three;
    private Button four;
    private Button six;
    private Button plus;
    private Button minus;
    private Button division;
    private Button multiplication;
    private Button bracketSmile;
    private Button bracketSad;
    private Button clearOne;
    private Button clearAll;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_four);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textViewShow = (TextView)findViewById(R.id.textView5);
        textViewResult = (TextView)findViewById(R.id.textViewResult);

        one = (Button)findViewById(R.id.button1);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        six = (Button)findViewById(R.id.button6);
        plus = (Button)findViewById(R.id.buttonPlus);
        minus = (Button)findViewById(R.id.buttonMinus);
        division = (Button)findViewById(R.id.buttonDivision);
        multiplication = (Button)findViewById(R.id.buttonMultiplication);
        bracketSmile = (Button)findViewById(R.id.buttonBracketSmile);
        bracketSad = (Button)findViewById(R.id.buttonBracketSad);
        clearOne = (Button)findViewById(R.id.buttonDel);
        clearAll = (Button)findViewById(R.id.buttonClear);
        check = (Button)findViewById(R.id.buttonCheck);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("1");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("4");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("6");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("-");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("/");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("*");
            }
        });

        bracketSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append(")");
            }
        });

        bracketSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.append("(");
            }
        });

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewShow.setText("");
            }
        });

        clearOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewShow.getText().toString().equals(""))
                {
                    textViewShow.setText("");
                }
                else {
                    String string = textViewShow.getText().toString();
                    String substring = string.substring(0,string.length()-1);
                    textViewShow.setText(substring);
                }
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewShow.getText().toString().equals(""))
                {
                    textViewResult.setText(getString(R.string.nothing_input));
                }
                else {
                    String string = textViewShow.getText().toString();
                    if (string.equals("6/(1-(3/4))") || string.equals("6/(1-3/4)"))
                    {
                        textViewResult.setText(getString(R.string.correct_answer));
                    }
                    else {
                        textViewResult.setText(getString(R.string.incorrect_answer));
                    }
                }
            }
        });
    }
}
