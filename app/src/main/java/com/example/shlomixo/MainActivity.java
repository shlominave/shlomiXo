package com.example.shlomixo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Integer> player1=new ArrayList<>();
    ArrayList<Integer> player2=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void processgame(View view) {
        Button choosesbtn = (Button) view;
        choosesbtn.setText("X");
        choosesbtn.setBackgroundResource(R.color.xocolor);
        choosesbtn.setEnabled(false);
        int cellnum = 0;
        if (choosesbtn.getId() == R.id.btn1)
            cellnum = 1;
        if (choosesbtn.getId() == R.id.btn2)
            cellnum = 2;
        if (choosesbtn.getId() == R.id.btn3)
            cellnum = 3;
        if (choosesbtn.getId() == R.id.btn4)
            cellnum = 4;
        if (choosesbtn.getId() == R.id.btn5)
            cellnum = 5;
        if (choosesbtn.getId() == R.id.btn6)
            cellnum = 6;
        if (choosesbtn.getId() == R.id.btn7)
            cellnum = 7;
        if (choosesbtn.getId() == R.id.btn8)
            cellnum = 8;
        if (choosesbtn.getId() == R.id.btn9)
            cellnum = 9;
        player1.add(cellnum);
    }
    public void  mobilechooses()
    {
        


    }
}