package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.barleybreak;

import android.widget.Button;

/**
 * Created by Developer on 06.04.2016.
 */
public class BarleyBreakEndChecker {
    private Button[] buttons;

    private int [] buttonsNumber;

    public BarleyBreakEndChecker(Button[] buttons) {
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

    public boolean endGame() {

        newArray();

        boolean flag = true;

        for(int i = 0; i<buttonsNumber.length-1; i++){
            if(buttonsNumber[i]==(buttonsNumber[i+1] - 1)){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
