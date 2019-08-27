package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityContact extends AppCompatActivity {
    Button AboutUs, Contact, Gallery;

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
        AboutUs = findViewById(R.id.aboutus);
        Contact = findViewById(R.id.contact);
        Gallery = findViewById(R.id.gallery);
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityContact.this, ActivityAboutUs.class);
                startActivity(i);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityContact.this, ActivityContact.class);
                startActivity(i);
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityContact.this, ActivityGallery.class);
                startActivity(i);
            }
        });


    }
}
