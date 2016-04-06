package com.kitsyambochka.logicgames.com.kitsyambochka.logicgames.puzzle;

import com.kitsyambochka.logicgames.R;

/**
 * Created by Developer on 06.04.2016.
 */
public class FillPic {
    private int [] buttonsNumber;

    public FillPic(int []buttonsNumber) {
        this.buttonsNumber = buttonsNumber;
    }

    public int showPic(int num) {
        int id = 0;
        int number = buttonsNumber[num];

        switch (number) {
            case 1:
                id = R.drawable.picture1;
                break;
            case 2:
                id = R.drawable.picture2;
                break;
            case 3:
                id = R.drawable.picture3;
                break;
            case 4:
                id = R.drawable.picture4;
                break;
            case 5:
                id = R.drawable.picture5;
                break;
            case 6:
                id = R.drawable.picture6;
                break;
            case 7:
                id = R.drawable.picture7;
                break;
            case 8:
                id = R.drawable.picture8;
                break;
            case 9:
                id = R.drawable.picture9;
                break;
            case 10:
                id = R.drawable.picture10;
                break;
            case 11:
                id = R.drawable.picture11;
                break;
            case 12:
                id = R.drawable.picture12;
                break;
            case 13:
                id = R.drawable.picture13;
                break;
            case 14:
                id = R.drawable.picture14;
                break;
            case 15:
                id = R.drawable.picture15;
                break;
            case 16:
                id = R.drawable.part16;
                break;
        }
        return id;
    }

    public int showNum(int num){
        return buttonsNumber[num];
    }

}
