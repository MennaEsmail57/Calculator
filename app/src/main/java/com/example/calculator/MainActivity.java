package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         final  TextView tvRez = findViewById(R.id.tv_rez);
         final  EditText ed_number_1 = findViewById(R.id.ed_number_1);
         final  EditText ed_number_2 = findViewById(R.id.ed_number_2);

        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mul = findViewById(R.id.btn_mul);
        Button btn_div = findViewById(R.id.btn_div);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 =  Integer.parseInt(ed_number_1.getText().toString());

                int num2 =  Integer.parseInt(ed_number_2.getText().toString());

                int rez  =  num1 + num2;

                tvRez.setText(String.valueOf(rez));



            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   
                int num1 =  Integer.parseInt(ed_number_1.getText().toString());

                int num2 =  Integer.parseInt(ed_number_2.getText().toString());

                int rez  =  num1 - num2;

                tvRez.setText(String.valueOf(rez));
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =  Integer.parseInt(ed_number_1.getText().toString());

                int num2 =  Integer.parseInt(ed_number_2.getText().toString());

                int rez  =  num1 * num2;

                tvRez.setText(String.valueOf(rez));
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =  Integer.parseInt(ed_number_1.getText().toString());

                int num2 =  Integer.parseInt(ed_number_2.getText().toString());

                int rez  =  num1 / num2;

                tvRez.setText(String.valueOf(rez));
            }
        });
    }
}