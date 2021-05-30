package com.rumeysatiryaki.btmobil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Username, password;
    Button signIn, signUp;
    ArrayList <Person> persons;
    Integer attempt;
    EditText textMessage;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); /*override ettiktens sonra alttaki set kısmıyla kıyafetini giydiriyoruz, yani layoutla xmlin ilişkisini kuruyoruz*/
        setContentView(R.layout.activity_main);
        defineVariables(); /*bu metotlar olmayabilidi direk kodun içine yazabilirdik */
        defineListeners();
        firebaseAuth = FirebaseAuth.getInstance();


    }


    private void defineListeners() {
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if (checkPerson()) {
                    intent = new Intent(v.getContext(), MenuActivity.class);
                    intent.putExtra("userId", Username.getText().toString());
                    cleanTextBoxes();
                    textMessage.setText("Sisteme giriş gerçekleştiriliyor...");
                    startActivity(intent);
                } else {
                    cleanTextBoxes();
                    attempt +=1;
                    textMessage.setText("Kullanıcı Adı veya Parola Hatalı");
                    if (attempt >=3){
                        Toast.makeText(MainActivity.this, "3 Defa Hatalı Giriş Yapıldı Uygulama Sonlandırılıyor"
                                , Toast.LENGTH_SHORT.show()
                        finish();
                    }

                }
            }

            private void cleanTextBoxes() {
                Username.setText("");
                password.setText("");
            }
        }
    }

    private boolean checkPerson() {
        for (Person aPerson : persons){
            if (Username.getText().toString().equals(aPerson.getUsername()) && password.getText().toString().equals(aPerson.getPassword()));
            return true;
            
        }
        return false;
    }
    private void defineVariables(){  /*bu kısım kişileri oluşturduğumuz ve aldığımız kısım*/
        attempt = 0;
        persons = Person.getPersonsList();
        Username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.signUp);
        
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}