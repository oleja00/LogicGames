package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.digits;

import android.widget.Button;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * Created by Developer on 06.04.2016.
 */
public class FillButton {

    private Button[] buttons;

    private Iterator<Integer> it;

    public FillButton(Button[] buttons) {
        this.buttons = buttons;
    }

    private void randomNumbers()
    {
        LinkedHashSet<Integer> setNumbers = new LinkedHashSet<>();

        do{
            Random random = new Random();
            int number = random.nextInt(100)+1;
            setNumbers.add(number);
        }while (setNumbers.size()!=buttons.length);

        it = setNumbers.iterator();
    }

    public void showButton(){

        randomNumbers();

        for (int i = 0; i<buttons.length; i++)
        {
            buttons[i].setText(""+it.next());
        }
    }
}
