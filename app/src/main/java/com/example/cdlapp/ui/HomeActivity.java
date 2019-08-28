package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class HomeActivity extends AppCompatActivity {
    Button AboutUs, Contact, Gallery, Equipments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AboutUs = findViewById(R.id.aboutus);
        Contact = findViewById(R.id.contact);
        Gallery = findViewById(R.id.gallery);
        Equipments = findViewById(R.id.equip);
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this, ActivityAboutUs.class);
                startActivity(i);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this, ActivityContact.class);
                startActivity(i);
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeActivity.this, ActivityGallery.class);
                startActivity(i);
            }

        });
        Equipments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Activityequipments.class);
                startActivity(i);
            }
        });
    }
}
