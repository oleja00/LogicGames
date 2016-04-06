package com.kitsyambochka.logicgames;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {
    private char board[][];

    private ImageButton Button00;
    private ImageButton Button01;
    private ImageButton Button02;
    private ImageButton Button10;
    private ImageButton Button11;
    private ImageButton Button12;
    private ImageButton Button20;
    private ImageButton Button21;
    private ImageButton Button22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button00 = (ImageButton)findViewById(R.id.imageButton00);
        Button01 = (ImageButton)findViewById(R.id.imageButton01);
        Button02 = (ImageButton)findViewById(R.id.imageButton02);
        Button10 = (ImageButton)findViewById(R.id.imageButton10);
        Button11 = (ImageButton)findViewById(R.id.imageButton11);
        Button12 = (ImageButton)findViewById(R.id.imageButton12);
        Button20 = (ImageButton)findViewById(R.id.imageButton20);
        Button21 = (ImageButton)findViewById(R.id.imageButton21);
        Button22 = (ImageButton)findViewById(R.id.imageButton22);


        board = new char[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '_';
            }
        }


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imageButton00:
                        Button00.setImageResource(R.drawable.cross);
                        Button00.setEnabled(false);
                        board[0][0] = 'X';
                        break;

                    case R.id.imageButton01:
                        Button01.setImageResource(R.drawable.cross);
                        Button01.setEnabled(false);
                        board[0][1] = 'X';
                        break;

                    case R.id.imageButton02:
                        Button02.setImageResource(R.drawable.cross);
                        Button02.setEnabled(false);
                        board[0][2] = 'X';
                        break;

                    case R.id.imageButton10:
                        Button10.setImageResource(R.drawable.cross);
                        Button10.setEnabled(false);
                        board[1][0] = 'X';
                        break;

                    case R.id.imageButton11:
                        Button11.setImageResource(R.drawable.cross);
                        Button11.setEnabled(false);
                        board[1][1] = 'X';
                        break;

                    case R.id.imageButton12:
                        Button12.setImageResource(R.drawable.cross);
                        Button12.setEnabled(false);
                        board[1][2] = 'X';
                        break;

                    case R.id.imageButton20:
                        Button20.setImageResource(R.drawable.cross);
                        Button20.setEnabled(false);
                        board[2][0] = 'X';
                        break;

                    case R.id.imageButton21:
                        Button21.setImageResource(R.drawable.cross);
                        Button21.setEnabled(false);
                        board[2][1] = 'X';
                        break;

                    case R.id.imageButton22:
                        Button22.setImageResource(R.drawable.cross);
                        Button22.setEnabled(false);
                        board[2][2] = 'X';
                        break;
                }
                if(CheckEndOfGame()==true){
                    endOfGame();
                }
                else {
                    compMove();
                }
                CheckEndOfGame();
                if(CheckEndOfGame()==true){
                    endOfGame();
                }
            }
        };
        Button00.setOnClickListener(onClickListener);
        Button01.setOnClickListener(onClickListener);
        Button02.setOnClickListener(onClickListener);
        Button10.setOnClickListener(onClickListener);
        Button11.setOnClickListener(onClickListener);
        Button12.setOnClickListener(onClickListener);
        Button20.setOnClickListener(onClickListener);
        Button21.setOnClickListener(onClickListener);
        Button22.setOnClickListener(onClickListener);

    }

    public boolean CheckEndOfGame()
    {
        for (int i = 0; i < 3; i++)
        {
            if ((board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') ||
                    (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') ||
                    (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                    (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
            {
                Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.wins_cross), Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
            else
            {
                if ((board[0][i] == '0' && board[1][i] == '0' && board[2][i] == '0') ||
                        (board[i][0] == '0' && board[i][1] == '0' && board[i][2] == '0') ||
                        (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') ||
                        (board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '0'))
                {
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.wins_nought), Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }
            }
        }

        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                if (board[j][k] == '_')
                {
                    return false;
                }
            }
        }

        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.draw), Toast.LENGTH_SHORT);
        toast.show();
        return true;
    }

    public void endOfGame()
    {
        Button00.setImageResource(R.drawable.whitepole);
        Button01.setImageResource(R.drawable.whitepole);
        Button02.setImageResource(R.drawable.whitepole);
        Button10.setImageResource(R.drawable.whitepole);
        Button11.setImageResource(R.drawable.whitepole);
        Button12.setImageResource(R.drawable.whitepole);
        Button20.setImageResource(R.drawable.whitepole);
        Button21.setImageResource(R.drawable.whitepole);
        Button22.setImageResource(R.drawable.whitepole);
        Button00.setEnabled(true);
        Button01.setEnabled(true);
        Button02.setEnabled(true);
        Button10.setEnabled(true);
        Button11.setEnabled(true);
        Button12.setEnabled(true);
        Button20.setEnabled(true);
        Button21.setEnabled(true);
        Button22.setEnabled(true);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '_';
            }
        }

    }

    public void compMove()
    {
        char znak = '0';
        if (board[1][1] == '_')
        {
            board[1][1] = znak;
            drawImage(1,1);
        }
        else
        {
            boolean operation = false;
            do
            {
                for (int i = 0; i < 3; i++)
                {
                    //-------------------------------------------------------------

                    if (board[i][0] == '_' && board[i][2] != '_'&& board[i][1] == board[i][2])
                    {
                        board[i][0] = znak;
                        drawImage(i,0);
                        operation = true;
                        break;
                    }
                    if (board[i][1] == '_' && board[i][2] != '_' && board[i][0] == board[i][2])
                    {
                        board[i][1] = znak;
                        drawImage(i,1);
                        operation = true;
                        break;
                    }
                    if (board[i][2] == '_' && board[i][1] != '_' && board[i][1] == board[i][0])
                    {
                        board[i][2] = znak;
                        drawImage(i,2);
                        operation = true;
                        break;
                    }

                    //-------------------------------------------------------------

                    if (board[0][i] == '_' && board[2][i] != '_'&& board[1][i] == board[2][i])
                    {
                        board[0][i] = znak;
                        drawImage(0,i);
                        operation = true;
                        break;
                    }
                    if (board[1][i] == '_' && board[2][i] != '_' && board[0][i] == board[2][i])
                    {
                        board[1][i] = znak;
                        drawImage(1,i);
                        operation = true;
                        break;
                    }
                    if (board[2][i] == '_' && board[1][i] != '_' && board[1][i] == board[0][i])
                    {
                        board[2][i] = znak;
                        drawImage(2,i);
                        operation = true;
                        break;
                    }

                    //-------------------------------------------------------------

                    if (board[0][0] == '_' && board[1][1] == board[2][2])
                    {
                        board[0][0] = znak;
                        drawImage(0,0);
                        operation = true;
                        break;
                    }
                    if (board[0][2] == '_' && board[1][1] == board[2][0])
                    {
                        board[0][2] = znak;
                        drawImage(0,2);
                        operation = true;
                        break;
                    }
                    if (board[2][0] == '_' && board[1][1] == board[0][2])
                    {
                        board[2][0] = znak;
                        drawImage(2,0);
                        operation = true;
                        break;
                    }

                    if (board[2][2] == '_' && board[1][1] == board[0][0])
                    {
                        board[2][2] = znak;
                        drawImage(2,2);
                        operation = true;
                        break;
                    }
                }

                if (operation != true)
                {
                    for (int i = 0; i < 3; i++)
                    {
                        boolean flag = false;
                        for (int j = 0; j < 3; j++)
                        {
                            if (board[i][j] == '_' && (i + j) % 2 == 0)
                            {
                                board[i][j] = znak;
                                drawImage(i,j);
                                flag = true;
                                operation = true;
                                break;
                            }
                            if (board[i][j] == '_')
                            {
                                board[i][j] = znak;
                                drawImage(i,j);
                                flag = true;
                                operation = true;
                                break;
                            }

                        }
                        if (flag == true)
                        {
                            break;
                        }
                    }
                }
            } while (operation != true);
        }
    }

    public void drawImage(int a, int b)
    {
        if (a==0) {
            if (b == 0) {
                Button00.setImageResource(R.drawable.nought);
                Button00.setEnabled(false);
            }
            if (b == 1) {
                Button01.setImageResource(R.drawable.nought);
                Button01.setEnabled(false);
            }
            if (b == 2) {
                Button02.setImageResource(R.drawable.nought);
                Button02.setEnabled(false);
            }
        }
        if(a==1)
        {
            if (b == 0) {
                Button10.setImageResource(R.drawable.nought);
                Button10.setEnabled(false);
            }
            if (b == 1) {
                Button11.setImageResource(R.drawable.nought);
                Button11.setEnabled(false);
            }
            if (b == 2) {
                Button12.setImageResource(R.drawable.nought);
                Button12.setEnabled(false);
            }
        }
        if (a==2)
        {
            if (b == 0) {
                Button20.setImageResource(R.drawable.nought);
                Button20.setEnabled(false);
            }
            if (b == 1) {
                Button21.setImageResource(R.drawable.nought);
                Button21.setEnabled(false);
            }
            if (b == 2) {
                Button22.setImageResource(R.drawable.nought);
                Button22.setEnabled(false);
            }
        }
    }
}
