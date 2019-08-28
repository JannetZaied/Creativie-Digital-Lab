package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityLogin extends AppCompatActivity {
    EditText name;
    EditText pass;
    Button btn2;
    ImageButton btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        name = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        btn1 = findViewById(R.id.login);
        btn2 = findViewById(R.id.signUp);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if (name.getText().toString().equals("Jannet")&&pass.getText().toString().equals("1234"))
                // { I should verify if it is a correct email (existing already in the base +password : Api from hedi
                Intent i = new Intent(ActivityLogin.this, HomeActivity.class);
                startActivity(i);
            }
            //  else {Toast.makeText(ActivityLogin.this,"Wrong username and password",Toast.LENGTH_LONG).show();
            //}


            // }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityLogin.this, ActivityFormulaire.class);
                startActivity(i);
            }
        });

    }
}
