package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityFormulaire extends AppCompatActivity {
    Button Login;
    ImageButton SignUp;
    EditText name, email, password;
    RadioButton student, entrepreneur;
    boolean st ,ent;
    String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);
        SignUp = findViewById(R.id.signUp);
        Login = findViewById(R.id.login_redirect);
        name = findViewById(R.id.nameEditText);
        email = findViewById(R.id.emailEditText);
        password = findViewById(R.id.passwordEditText);
        student = findViewById(R.id.studentCheck);
        entrepreneur = findViewById(R.id.entrepreneur);
        st=student.isChecked();
        ent=entrepreneur.isChecked();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityFormulaire.this, ActivityLogin.class);
                startActivity(i);
            }
        });


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if the email exists already + buttons checked , bla bla , I can precise for every input if i have enough time
                // i can do them in boolean methods / function too , i will see

                 if(!(email.getText().toString().isEmpty())&&(email.getText().toString().trim().matches(emailPattern))&&!(name.getText().toString().isEmpty())&& !(password.getText().toString().isEmpty()))
                          {
                              Intent i= new Intent(ActivityFormulaire.this, HomeActivity.class);
                              startActivity(i);

                          }


                else {
//
                     Toast.makeText(ActivityFormulaire.this,"Verify your inputs please",Toast.LENGTH_SHORT).show();

                }
//              //recuperation des donnée
               name.getText();
               email.getText();
               password.getText();
               st=student.isChecked();
               ent=entrepreneur.isChecked();}





                });
        }}





