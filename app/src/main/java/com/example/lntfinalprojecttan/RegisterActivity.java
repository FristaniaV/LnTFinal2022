package com.example.lntfinalprojecttan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText RegisEmail;
    EditText RegisPassword;
    TextView LoginHere;
    Button RegisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        RegisEmail = findViewById(R.id.email_register);
        RegisPassword = findViewById(R.id.password_register);
        LoginHere = findViewById(R.id.regis_login_btn);
        RegisBtn = findViewById(R.id.btn_register);
    }
}