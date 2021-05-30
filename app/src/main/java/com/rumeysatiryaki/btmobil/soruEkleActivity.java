package com.rumeysatiryaki.btmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class soruEkleActivity extends AppCompatActivity {

    EditText TextSoruMetni2;
    EditText TextA;
    EditText TextB;
    EditText TextC;
    EditText TextD;
    EditText CorrectAns;
    EditText Zorluk;
    Button btn_ekle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru_ekle);
        defineVariables();
        defineListeners();
    }

    private void defineListeners() {
    }

    private void defineVariables() {
        TextSoruMetni2 = (EditText) findViewById(R.id.TextSoruMetni2);
        TextA = (EditText) findViewById(R.id.TextA);
        TextB = (EditText) findViewById(R.id.TextB);
        TextC = (EditText) findViewById(R.id.TextC);
        TextD = (EditText) findViewById(R.id.TextD);
        CorrectAns = (EditText) findViewById(R.id.CorrectAns);
        Zorluk = (EditText) findViewById(R.id.Zorluk);
        btn_ekle = (Button) findViewById(R.id.btn_ekle);


    }
    

}