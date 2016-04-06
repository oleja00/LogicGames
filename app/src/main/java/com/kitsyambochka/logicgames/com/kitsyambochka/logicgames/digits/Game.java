package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.digits;

import android.view.View;
import android.widget.Button;

import com.kitsyambochka.logicgames.R;

/**
 * Created by Developer on 06.04.2016.
 */
public class Game {

    private int numberButton;
    private Button[]buttons;
    int minimize;

    private int [] buttonsNumber;

    private int redButton = R.drawable.redbut;
    private int greyButton = R.drawable.normbut;

    public Game(int numberButton, Button [] buttons, int minimize) {
        this.numberButton = numberButton;
        this.buttons = buttons;
        this.minimize = minimize;
    }

    private void newArray()
    {
        buttonsNumber = new int[buttons.length];
        for (int i = 0; i<buttons.length; i++)
        {
            int number = Integer.parseInt(buttons[i].getText().toString());
            buttonsNumber[i] = number;
        }
    }



    public void changeButton()
    {
        newArray();

        int max = buttonsNumber[0];

        for (int i = 0; i<buttonsNumber.length; i++){
            if(buttonsNumber[i] > max)
            {
                max = buttonsNumber[i];
            }
        }

        int min = max+1;

        for (int i = 0; i<buttonsNumber.length; i++){
            if(buttonsNumber[i] < min && buttonsNumber[i]>minimize)
            {
                min = buttonsNumber[i];
            }
        }

        if (min == buttonsNumber[numberButton]) {
            minimize =  buttonsNumber[numberButton];
            buttons[numberButton].setEnabled(false);
            buttons[numberButton].setVisibility(View.INVISIBLE);
            clear();
        }
        else {
            buttons[numberButton].setBackgroundResource(redButton);
        }
    }

    private void clear(){
        for (int i = 0; i<buttons.length; i++){
            buttons[i].setBackgroundResource(greyButton);
        }
    }
    public int getMinimize() {
        return minimize;
    }
}
