package com.example.shlomixo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> player1 = new ArrayList<>();
    ArrayList<Integer> player2 = new ArrayList<>();

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
        if (isgameover(player1)) {
          //  displayWinner("player 1!!!");
        } else {
         //   mobilechooses();


        }
    }

    public boolean isgameover(ArrayList<Integer> player) {
        ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> row4 = new ArrayList<Integer>(Arrays.asList(1, 4, 7));
        ArrayList<Integer> row5 = new ArrayList<Integer>(Arrays.asList(2, 5, 8));
        ArrayList<Integer> row6 = new ArrayList<Integer>(Arrays.asList(3, 6, 9));
        ArrayList<Integer> diagonal1 = new ArrayList<Integer>(Arrays.asList(1, 5, 9));
        ArrayList<Integer> diagonal2 = new ArrayList<Integer>(Arrays.asList(3, 5, 7));
        if (player.containsAll(row1) || player.containsAll(row2) || player.containsAll(row3) || player.containsAll(row4) ||
                player.containsAll(row5) || player.containsAll(row6) || player.containsAll(diagonal1) || player.containsAll(diagonal2)) {
            return true;
        } else return false;
    }

       /**  public void  mobilechooses()
            {

                Button chosen;
                int num;
                if((player1.contains(2)&& player1.contains(3))
                ||(player1.contains(4)&& player1.contains(7)) || (player1.contains(5)&& player1.contains(9))) {
                 chosen=findViewById(R.id.btn1);
                 chosen.setText("O");
                 chosen.setEnabled(false);
                 player2.add(1);
                }
                else if((player1.contains(1)&& player1.contains(3))
                ||(player1.contains(5)&& player1.contains(8))) {
                 chosen=findViewById(R.id.btn1);
                 chosen.setText("O");
                    chosen.setEnabled(false);
                 player2.add(2);
                }
                else if((player1.contains(2)&& player1.contains(1))
                 ||(player1.contains(5)&& player1.contains(7)) || (player1.contains(6)&& player1.contains(9))) {
                  chosen=findViewById(R.id.btn3);
                  chosen.setText("O");
                    chosen.setEnabled(false);
                  player2.add(3);
                    }
                else if((player1.contains(5)&& player1.contains(6))
                 ||(player1.contains(1)&& player1.contains(7))) {
                  chosen=findViewById(R.id.btn4);
                  chosen.setText("O");
                    chosen.setEnabled(false);
                  player2.add(4);
                }
                else if((player1.contains(4)&& player1.contains(6))
                ||(player1.contains(2)&& player1.contains(8)) || (player1.contains(1)&& player1.contains(9))
                ||(player1.contains(3)&& player1.contains(7))) {
                  chosen=findViewById(R.id.btn5);
                  chosen.setText("O");
                    chosen.setEnabled(false);
                  player2.add(5);
                }
                else if((player1.contains(4)&& player1.contains(5))
                ||(player1.contains(3)&& player1.contains(9))) {
                  chosen=findViewById(R.id.btn6);
                  chosen.setText("O");
                    chosen.setEnabled(false);
                  player2.add(6);
                }
                else if((player1.contains(8)&& player1.contains(9))
                ||(player1.contains(3)&& player1.contains(5)) || (player1.contains(1)&& player1.contains(4))) {
                  chosen=findViewById(R.id.btn7);
                  chosen.setText("O");
                    chosen.setEnabled(false);
                  player2.add(7);
                }
                else if((player1.contains(2)&& player1.contains(5))
                ||(player1.contains(7)&& player1.contains(9))) {
                 chosen=findViewById(R.id.btn8);
                    chosen.setEnabled(false);
                 chosen.setText("O");
                 player2.add(8);
                }
                else if((player1.contains(8)&& player1.contains(7))
                ||(player1.contains(3)&& player1.contains(6)) || (player1.contains(1)&& player1.contains(5))) {
                 chosen=findViewById(R.id.btn9);
                 chosen.setText("O");
                    chosen.setEnabled(false);
                 player2.add(9);
                }
                else {
                 num=TextCheck();
                 if(num==1)
                 {
                 chosen=findViewById(R.id.btn1);
                 chosen.setText("O");
                 }
                 if(num==2)
                 {
                  chosen=findViewById(R.id.btn2);
                  chosen.setText("O");
                 }
                 if(num==3)
                 {
                 chosen=findViewById(R.id.btn3);
                 chosen.setText("O");
                 }

                 if(num==4)
                 {
                 chosen=findViewById(R.id.btn4);
                 chosen.setText("O");
                 }
                 if(num==5)
                  {
                  chosen=findViewById(R.id.btn5);
                  chosen.setText("O");
                  }
                  if(num==6)
                  {
                  chosen=findViewById(R.id.btn6);
                  chosen.setText("O");
                  }
                  if(num==7)
                  {
                  chosen=findViewById(R.id.btn7);
                  chosen.setText("O");
                  }
                  if(num==8)
                   {
                   chosen=findViewById(R.id.btn8);
                   chosen.setText("O");
                   }
                  if(num==9)
                   {
                   chosen=findViewById(R.id.btn9);
                   chosen.setText("O");
                   }
                }
                if(isgameover(player2))
                 displayWinner("mobile wins!");
            }
            public int TextCheck(){
                Button btn;
                btn=findViewById(R.id.btn1);
                if(btn.getText().toString()!="Button"){
                btn=findViewById(R.id.btn2);

                }
                else return 1;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn3);

                }
                else return 2;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn4);

                }
                else  return 3;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn5);

                }
                else return 4;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn6);

                }
                else return 5;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn7);

                }
                else return 6;
                if(btn.getText().toString()!="Button"){
                    btn=findViewById(R.id.btn8);

                }
                else return 7;
               if( btn.getText().toString()!="Button")
                return 9;
               else return 8;
            }

          private void displayWinner(String winner)
            {
                AlertDialog.Builder adb=new AlertDialog.Builder(this);
                adb.setTitle("THE WINNER IS:");
                adb.setMessage(winner);
                adb.setPositiveButton("ok",null);
                adb.create().show();
            }
        }
*/
}

