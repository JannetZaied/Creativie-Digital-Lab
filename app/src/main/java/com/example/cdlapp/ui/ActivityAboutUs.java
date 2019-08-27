package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityAboutUs extends AppCompatActivity {
    Button AboutUs, Contact, Gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        AboutUs = findViewById(R.id.aboutus);
        Contact = findViewById(R.id.contact);
        Gallery = findViewById(R.id.gallery);
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityAboutUs.this, ActivityAboutUs.class);
                startActivity(i);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityAboutUs.this, ActivityContact.class);
                startActivity(i);
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityAboutUs.this, ActivityGallery.class);
                startActivity(i);
            }
        });
    }
}
