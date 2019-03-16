package com.example.ejer2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Drawable opc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn1.setBackground(opc);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn2.setBackground(opc);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn3.setBackground(opc);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn4.setBackground(opc);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn5.setBackground(opc);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn6.setBackground(opc);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn7.setBackground(opc);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn8.setBackground(opc);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int img = (int) Math.floor(Math.random()*2);
                switch (img){
                    case 0:
                        opc = getResources().getDrawable(R.drawable.f2);
                        break;
                    case 1:
                        opc = getResources().getDrawable(R.drawable.f3);
                        break;
                }
                btn9.setBackground(opc);

            }
        });
    }
}
