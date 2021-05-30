package com.rumeysatiryaki.btmobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton soruEkleButton, soruListeleButton, sinavOlButton, SınavAyarButton, cikisYap;
    private String currentUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        currentUsername = getIntent(), getStringExtra("userId");
        defineVariables();
        defineListeners();
        Toast.makeText(this, "Hoşgeldin" + currentUsername, Toast.LENGTH_SHORT).show();
    }

    private Object getStringExtra(String name) {
    }


}

    private void defineListeners() {
    SınavAyarButton.setOnClickListener(this);
    sinavOlButton.setOnClickListener(this);
    soruEkleButton.setOnClickListener(this);
    soruListeleButton.setOnClickListener(this);
    cikisYap.setOnClickListener(this);
    }

    public void defineVariables(){

        SınavAyarButton = (ImageButton) findViewById(R.id.SınavAyarButton);
        sinavOlButton = (ImageButton) findViewById(R.id.sinavOlButton);
        soruListeleButton = (ImageButton) findViewById(R.id.soruListeleButton);
        soruEkleButton = (ImageButton) findViewById(R.id.soruEkleButton);
        cikisYap = (ImageButton) findViewById(R.id.cikisYap);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.soruEkleButton:
                intent = new Intent(v.getContext(), soruEkleActivity.class);
                intent.putExtra("userId", currentUsername);
                startActivity(intent);
                break;
            case R.id.soruListeleButton:
                intent = new Intent(v.getContext(), soruListeleActivity.class);
                startActivity(intent);
                break;
            case R.id.sinavOlButton:
                intent = new Intent(v.getContext(), sinavOlActivity.class);
                startActivity(intent);
                break;
            case R.id.SınavAyarButton:
                intent = new Intent(v.getContext(), SınavAyarActivity.class);
                startActivity(intent);
                break;
            case R.id.cikisYap:
                intent = new Intent(v.getContext(), MainActivity.class);
                finish();
                startActivity(intent);
                break;

            default:
                break;


        }
    }







    

}