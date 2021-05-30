package com.rumeysatiryaki.btmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SoruListelemeActivity extends AppCompatActivity {
    RecyclerView.LayoutManager LayoutManager;
    List<Person> persons;
    RecyclerView recyclerView;
    SoruAdapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru_listeleme);
        defineVariables();
    }

    private void defineVariables() {
        recyclerView = (RecyclerView) findViewById(R.id.recylerview);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager((layoutManager));
        persons = new ArrayList<>();
        persons = Person.getPersonsList();
        adp = new SoruAdapter(this, persons);
        recyclerView.setAdapter(adp);
    }
}