package com.example.lntfinalprojecttan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText LoginEmail;
    EditText LoginPassword;
    TextView RegisHere;
    Button LoginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginEmail = findViewById(R.id.email_login);
        LoginPassword = findViewById(R.id.password_login);
        RegisHere = findViewById(R.id.login_regis_btn);
        LoginBtn = findViewById(R.id.btn_login);
    }
}