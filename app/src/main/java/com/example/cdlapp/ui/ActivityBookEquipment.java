package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityBookEquipment extends AppCompatActivity {
    Button sumbit, exist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_equipment);
        sumbit = findViewById(R.id.submit);
        exist = findViewById(R.id.exist);
        exist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityBookEquipment.this, Activityequipments.class);
                startActivity(i);
            }
        });

    }
}