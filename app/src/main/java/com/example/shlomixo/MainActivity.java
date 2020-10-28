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
    public void processgame(View view){
        Button choosesbtn=(Button)view;
        choosesbtn.setText("X");
        choosesbtn.setBackgroundResource(R.color.xocolor);
    }
}