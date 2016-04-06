package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.barleybreak;

import android.widget.Button;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * Created by Developer on 06.04.2016.
 */
public class BarleyBreakFillButton {
    private Button[] buttons;

    private Iterator<Integer> it;

    private int [] buttonsNumber;

    public BarleyBreakFillButton(Button[] buttons) {
        this.buttons = buttons;
    }

    private void randomNumbers()
    {
        LinkedHashSet<Integer> setNumbers = new LinkedHashSet<>();

        do{
            Random random = new Random();
            int number = random.nextInt(16)+1;
            setNumbers.add(number);
        }while (setNumbers.size()!=buttons.length);

        it = setNumbers.iterator();

        buttonsNumber = new int[buttons.length];

        for (int i = 0; i<buttonsNumber.length; i++)
        {
            buttonsNumber[i] = it.next();
        }
    }

    private void checkButton(){

        boolean flag = true;
        do{
            randomNumbers();

            int counter =0;

            for (int i =0; i<buttonsNumber.length;i++){
                for(int j = i+1; j<buttonsNumber.length; j++) {
                    if(buttonsNumber[i]!=16)
                    {
                        if (buttonsNumber[j]<buttonsNumber[i]) {
                            counter++;
                        }
                    }
                }
            }

            for (int i =0; i<buttonsNumber.length; i++){
                if(buttonsNumber[i]==16){
                    if(i<=3){
                        counter+=1;
                    }
                    if (i>3&&i<=7){
                        counter+=2;
                    }
                    if(i>7&&i<=11){
                        counter+=3;
                    }
                    if(i>11&&i<=15){
                        counter+=4;
                    }
                }
            }


            if(counter%2==0){

                flag = false;
            }
        }while (flag == true);

    }

    public void fill(){
        checkButton();
        for (int i = 0; i<buttons.length; i++){
            if(buttonsNumber[i]==16){
                buttons[i].setText("");
            }
            else {
                buttons[i].setText(""+buttonsNumber[i]);
            }
        }
    }

}
