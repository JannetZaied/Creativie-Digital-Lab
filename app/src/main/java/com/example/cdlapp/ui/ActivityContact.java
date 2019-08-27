package com.example.cdlapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.cdlapp.R;

public class ActivityContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView fcb= findViewById(R.id.fb);
        fcb.setMovementMethod(LinkMovementMethod.getInstance());
        TextView lin= findViewById(R.id.in);
        lin.setMovementMethod(LinkMovementMethod.getInstance());
        TextView web= findViewById(R.id.site);
        lin.setMovementMethod(LinkMovementMethod.getInstance());



    }
}
