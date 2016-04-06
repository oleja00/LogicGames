package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.digits;

import android.widget.Button;

/**
 * Created by Developer on 06.04.2016.
 */
public class EndChecker {
    private Button[] buttons;

    public EndChecker(Button[] buttons) {
        this.buttons = buttons;
    }

    public boolean endGame(){
        boolean flag = true;

        for(int i = 0; i<buttons.length; i++){
            if(buttons[i].isEnabled()){
                flag = false;
                break;
            }
        }

        return flag;
    }
}
