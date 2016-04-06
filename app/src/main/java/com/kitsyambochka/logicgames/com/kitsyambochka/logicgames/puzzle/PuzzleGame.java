package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.puzzle;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

/**
 * Created by Developer on 06.04.2016.
 */
public class PuzzleGame {
    private int numberButton;
    private Button[]buttons;

    private int [] buttonsNumber;

    public PuzzleGame(int numberButton, Button [] buttons) {
        this.numberButton = numberButton;
        this.buttons = buttons;
    }

    private void newArray()
    {
        buttonsNumber = new int[buttons.length];
        for (int i = 0; i<buttons.length; i++)
        {
            if(buttons[i].getText().toString().equals(""))
            {
                buttonsNumber[i] = 16;
            }
            else {
                int number = Integer.parseInt(buttons[i].getText().toString());
                buttonsNumber[i] = number;
            }

        }
    }

    public void changeButton() {
        newArray();



        if(buttonsNumber[numberButton]!=16){
            try {
                if(buttonsNumber[numberButton-4] == 16){
                    int temp = buttonsNumber[numberButton- 4];
                    buttonsNumber[numberButton- 4] = buttonsNumber[numberButton];
                    buttonsNumber[numberButton] = temp;
                }
            }catch (Exception e){}

            try {
                if(buttonsNumber[numberButton+4] == 16){
                    int temp = buttonsNumber[numberButton+ 4];
                    buttonsNumber[numberButton+ 4] = buttonsNumber[numberButton];
                    buttonsNumber[numberButton] = temp;
                }
            }catch (Exception e){}

            try {
                if(buttonsNumber[numberButton+1] == 16){
                    if(numberButton!=3 && numberButton!=7 && numberButton!=11){
                        int temp = buttonsNumber[numberButton+1];
                        buttonsNumber[numberButton+1] = buttonsNumber[numberButton];
                        buttonsNumber[numberButton] = temp;
                    }
                }
            }catch (Exception e){}

            try {
                if(buttonsNumber[numberButton-1] == 16){
                    if(numberButton%4 !=0){
                        int temp = buttonsNumber[numberButton- 1];
                        buttonsNumber[numberButton-1] = buttonsNumber[numberButton];
                        buttonsNumber[numberButton] = temp;
                    }
                }
            }catch (Exception e){}
        }

        for (int i = 0; i<buttons.length; i++){
            FillPic fillPic = new FillPic(buttonsNumber);
            if(buttonsNumber[i]==16){
                buttons[i].setText("");
                buttons[i].setBackgroundResource(fillPic.showPic(i));
            }
            else {
                buttons[i].setBackgroundResource(fillPic.showPic(i));
                buttons[i].setText("" + buttonsNumber[i]);
                buttons[i].setTextColor(View.INVISIBLE);
            }
        }
    }
}
