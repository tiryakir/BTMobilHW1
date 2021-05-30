package com.rumeysatiryaki.btmobil;

import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Sorular {
    private String TextSoruMetni2;
    private String TextA;
    private String TextB;
    private String TextC;
    private String TextD;
    private String CorrectAns;
    private int Zorluk;


    public Sorular(String TextSoruMetni2, String TextA, String TextB, String TextC, String TextD,
                   String CorrectAns, int Zorluk) {
        this.TextSoruMetni2 = TextSoruMetni2;
        this.TextA = TextA;
        this.TextB = TextB;
        this.TextC = TextC;
        this.TextD = TextD;
        this.CorrectAns = CorrectAns;
        this.Zorluk = Zorluk;
    }

    public static ArrayList<Sorular> getSorularsList() {
    }

    public String getTextSoruMetni2() {
        return TextSoruMetni2;
    }

    public void setTextSoruMetni2(String TextSoruMetni2) {
        this.TextSoruMetni2 = TextSoruMetni2;
    }

    public int Zorluk() {
        return Zorluk;
    }

    public void setZorluk(int Zorluk) {
        this.Zorluk = Zorluk;
    }

    public String getTextA() {
        return TextA;
    }

    public void setTextA(String TextA) {
        this.TextA = TextA;
    }

    public String getTextB() {
        return TextB;
    }
    public void setTextB(String TextB) {
        this.TextB = TextB;
    }
    public String getTextC() {
        return TextC;
    }

    public void setTextC(String TextC) {
        this.TextC = TextC;
    }
    public String getTextD() {
        return TextD;
    }

    public void setTextD(String TextD) {
        this.TextD = TextD;
    }
    public String getCorrectAns() {
        return CorrectAns;
    }

    public void setCorrectAns(String CorrectAns) {
        this.CorrectAns = CorrectAns;
    }


    public static ArrayList<Sorular> getSoruListeleme{}
    {

        ArrayList sorulars = new ArrayList();
        sorulars.add(new Sorular(TextSoruMetni2:"Türkiye'nin başkenti hangi şehirdir?",
            TextA:"Sivas", TextB:"Çankırı", TextC:"İstanbul", TextD:"Ankara", CorrectAns:TextD,
            Zorluk: 1));
        sorulars.add(new Sorular(TextSoruMetni2:"Osmanlı'nın başkenti hangi şehirdi?",
            TextA:"Sivas", TextB:"Çankırı", TextC:"İstanbul", TextD:"Ankara", CorrectAns:TextC,
            Zorluk: 1));


        return sorulars;

    }

}