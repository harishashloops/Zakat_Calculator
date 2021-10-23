package com.devloper_haris.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float perTola=1;

    }
    public void onBtnClicked(View view) {
        RadioGroup nisab=findViewById(R.id.radioGroup);
        int selectedId = nisab.getCheckedRadioButtonId();
        RadioButton radio = findViewById(selectedId);

        String s= (String) radio.getText();
        TextView txtHello = findViewById(R.id.nisabTxt);
        if(s.contains("Gold"))
        {

            txtHello.setText(radio.getText());

        }
        else
        {
            txtHello.setText("heloo");


        }



//        txtHello.setText((selectedId));


    }
}