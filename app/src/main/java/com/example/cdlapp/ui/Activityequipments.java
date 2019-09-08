package com.example.cdlapp.ui;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.cdlapp.R;

import java.util.ArrayList;

import Model.Equipment;
import View.AdapterEquipment;


public class Activityequipments extends AppCompatActivity {
    ViewPager viewPager;
    AdapterEquipment adapterEquipment;
    ArrayList<Equipment> Equipments;
    Integer[] colors = null;
    Button book, AboutUs, Gallery, Contact;
    LinearLayout test;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    // String Url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityequipments);
        book = findViewById(R.id.order);
        Equipments = new ArrayList<>();
        test = findViewById(R.id.test);
        AboutUs = findViewById(R.id.aboutus);
        Gallery = findViewById(R.id.gallery);
        Contact = findViewById(R.id.contact);
        Equipments.add(new Equipment(R.drawable.g, "1", "Cooler Master Maker 5t", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c2, "2", "Spirit of Gamers Pcs", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c3, "3", "Oculus Rift", "3dt/h"));

        Equipments.add(new Equipment(R.drawable.c4, "4", "Oculus Go", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c5, "5", "Microsoft Hololens", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c6, "6", "Leap Motion", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c7, "7", "HTC Vive Pro", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c8, "8", "CardBoard", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c9, "9", "Samsung Gear VR", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c10, "10", "Samsung Gear 360°", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c11, "11", "PlayStation 4Pro", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c12, "12", "PS4 VR Kit", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c13, "13", "Xbox One S", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c14, "14", "Kinect V2+Adapter for PC", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c15, "15", "Samsung S8+", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c16, "16", "iPhone X", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.c17, "17", "iPad Pro", "3dt/h"));


        adapterEquipment = new AdapterEquipment(Equipments, this);


        try {
            viewPager = findViewById(R.id.viewPager1);
            viewPager.setAdapter(adapterEquipment);
            viewPager.setPadding(130, 0, 130, 0);
            colors = new Integer[]{getResources().getColor(R.color.color1),
                    getResources().getColor(R.color.color2),
                    getResources().getColor(R.color.color3),
                    getResources().getColor(R.color.color4)};

            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    if (position < (adapterEquipment.getCount() - 1) && position < (colors.length - 1)) {
                        viewPager.setBackgroundColor(
                                (Integer) argbEvaluator.evaluate(positionOffset,
                                        colors[position],
                                        colors[position + 1])
                        );
                    } else {
                        viewPager.setBackgroundColor(colors[colors.length - 1]);
                    }

                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activityequipments.this, ActivityBookEquipment.class);
                startActivity(i);


            }
        });
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activityequipments.this, ActivityAboutUs.class);
                startActivity(i);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activityequipments.this, ActivityContact.class);
                startActivity(i);
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activityequipments.this, ActivityGallery.class);
                startActivity(i);
            }

        });


    }
}


//


//*************Getting the needed informations from the backend..*****
//    private void jsonGetEquipments() {
//
//        JsonObjectRequest requestEequipments = new JsonObjectRequest(Request.Method.GET, Url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        //  JsonArray eventArray;
//                        try {
//                            // JSONArray jsonArrayEquipments=new JSONArray(response);
//                            JSONArray jsonArrayEquipments = response.getJSONArray("equipments");
//                            for (int i = 0; i < (jsonArrayEvent).length(); i++) {
//                                JSONObject Equipments = jsonArrayEquipments.getJSONObject(i);
//                                String reference = ActivityEvent.getString("reference");
//                                String title = ActivityEvent.getString("title");
//
//                                String price = ActivityEvent.getString("price");
//
//
//
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//
//            }
//        }
//
//
//        );
////        equipmentQueue.add(requestEvent);
////        adapterEquipment = new AdapterEquipment(ActivityEvent, this);
////
////
////        try {
////            viewPager = findViewById(R.id.viewPager1);
////            viewPager.setAdapter(adpterEquipments);
////            viewPager.setPadding(130, 0, 130, 0);
////            colors = new Integer[]{getResources().getColor(R.color.color1),
////                    getResources().getColor(R.color.color2),
////                    getResources().getColor(R.color.color3),
////                    getResources().getColor(R.color.color4)};
////
////            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
////
////                @Override
////                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
////
////                    if (position < (adapterEquipment.getCount() - 1) && position < (colors.length - 1)) {
////                        viewPager.setBackgroundColor(
////                                (Integer) argbEvaluator.evaluate(positionOffset,
////                                        colors[position],
////                                        colors[position + 1])
////                        );
////                    } else {
////                        viewPager.setBackgroundColor(colors[colors.length - 1]);
////                    }
////
////                }
////
////                @Override
////                public void onPageSelected(int position) {
////
////                }
////
////                @Override
////                public void onPageScrollStateChanged(int state) {
////
////                }
////            });
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//    }
//}
