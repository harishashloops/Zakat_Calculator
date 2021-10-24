package com.devloper_haris.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
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
    }
    public void onBtnClicked(View view) {
        double zakatthreshhold=0;
        double multiple=  7.5;
        RadioGroup nisab=findViewById(R.id.radioGroup);
        int selectedId = nisab.getCheckedRadioButtonId();
        RadioButton radio = findViewById(selectedId);

        String s= (String) radio.getText();
        TextView txtHello = findViewById(R.id.nisabTxt);
        if(s.contains("Gold"))
        {

            multiple=7.5;
            txtHello.setText("help");
        }
        else
        {
            multiple=52.5;

        }
        EditText pertola=findViewById(R.id.perTolaPrice);
        String temp=pertola.getText().toString();
        double PertolaPrice=500;
        if (!"".equals(temp)){
            PertolaPrice=Double.parseDouble(temp);
        }

        zakatthreshhold=PertolaPrice*multiple;

        //total cash sum
        double cash1,cash2,cash3,cash4;

        EditText cashText1=findViewById(R.id.cash1);
        String temp1=cashText1.getText().toString();
        cash1=0;
        if (!"".equals(temp1)){
            cash1=Double.parseDouble(temp1);
        }

        EditText cashText2=findViewById(R.id.cash2);
        String temp2=cashText2.getText().toString();
        cash2=0;
        if (!"".equals(temp2)){
            cash2=Double.parseDouble(temp2);
        }

        EditText cashText3=findViewById(R.id.cash3);
        String temp3=cashText3.getText().toString();
        cash3=0;
        if (!"".equals(temp3)){
            cash3=Double.parseDouble(temp3);
        }

        EditText cashText4=findViewById(R.id.cash4);
        String temp4=cashText4.getText().toString();
        cash4=0;
        if (!"".equals(temp4)){
            cash4=Double.parseDouble(temp4);
        }

        double totalCashSum=cash1+cash2+cash3+cash4;

        //total libility sum
        double libility1,libility2,libility3;

        EditText libilityText=findViewById(R.id.libility1);
        String temp5=libilityText.getText().toString();
        libility1=0;
        if (!"".equals(temp5)){
            libility1=Double.parseDouble(temp5);
        }

        EditText libilityText1=findViewById(R.id.libility2);
        String temp6=libilityText1.getText().toString();
        libility2=0;
        if (!"".equals(temp6)){
            libility2=Double.parseDouble(temp6);
        }

        EditText libilityText2=findViewById(R.id.libility3);
        String temp7=libilityText2.getText().toString();
        libility3=0;
        if (!"".equals(temp7)){
            libility3=Double.parseDouble(temp7);
        }

        double totalLibilitySum=libility1+libility2+libility3;

        double NetWorth=totalCashSum-totalLibilitySum;

        double zakat=0;
        if(NetWorth>zakatthreshhold)
        {
            zakat=(2.5*NetWorth)/100;
        }


        String totalCashresult = new Double(totalCashSum).toString();
        String totalLibiltyresult = new Double(totalLibilitySum).toString();
        String NetWorthresult = new Double(NetWorth).toString();
        String Zakatresult = new Double(zakat).toString();

        TextView Net=findViewById(R.id.NetWorth);
        Net.setText("Rs:"+NetWorthresult);
        TextView ZakatTxt=findViewById(R.id.Zakat);
        ZakatTxt.setText("Rs:"+Zakatresult);














//        txtHello.setText((selectedId));


    }
}