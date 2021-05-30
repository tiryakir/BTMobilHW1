package com.rumeysatiryaki.btmobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SignUpPage extends AppCompatActivity {

    EditText SignUpName;
    EditText SignUpSurname;
    EditText EmailAddress;
    Integer PhoneNumber;
    Integer BirthDate;
    String PasswordSignUp;
    String SignUpRePassword;
    Button FotoEkle;
    Button kayıtOl;
    ArrayList<Person> persons;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page2);
        defineVariables();
        defineListeners();
    }

    private void defineListeners() {
        kayıtOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMainActivity;
                String inputName = SignUpName.getText().toString();
                String inputSurname = SignUpSurname.getText().toString();
                String inputEmail = EmailAddress.getText().toString();
                int inputBirth = BirthDate.getClass().getConstructor();
                int inputPhone = PhoneNumber.getClass().getConstructor();
                String inputPassword = PasswordSignUp.getText().toString();
                String inputRepassword = SignUpRePassword.getText().toString();

                if (inputName.isEmpty() || inputSurname.isEmpty() || inputEmail.isEmpty() || inputBirth.isEmpty() || inputPhone.isEmpty() || inputPassword.isEmpty() || inputRepassword.isEmpty() ||)
                    Toast.makeText(SignUpPage.this, "Bilgileridoğru tamamlayınız", Toast.LENGTH_SHORT).show();
            }
            else if(inputPassword.equals(inputRepassword)==false){
                Toast.makeText(SignUpPage.this,"Girdiğiniz şifreler aynı değil, kontrol ediniz.", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(SignUpPage.this,"Üyeliğiniz başarılı şekilde oluşturulmuştur", Toast.LENGTH_SHORT).show();
                intentMainActivity = new Intent(view.getContext(),MainActivity.class);
                intentMainActivity.putExtrra("persons",persons);
                startActivity(intentMainActivity);

            }
        }


    }

    private void defineVariables() {
        SignUpName = findViewById(R.id.SignUpName);
        SignUpSurname = findViewById(R.id.SignUpSurname);
        EmailAddress = findViewById(R.id.EmailAddress);
        PhoneNumber = findViewById(R.id.PhoneNumber);
        BirthDate = findViewById(R.id.BirthDate);
        PasswordSignUp = findViewById(R.id.PasswordSignUp);
        SignUpRePassword = findViewById(R.id.SignUpRePassword);
        FotoEkle = findViewById(R.id.FotoEkle);
        kayıtOl = findViewById(R.id.kayıtOl);

    }
}