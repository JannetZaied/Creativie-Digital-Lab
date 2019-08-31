package com.example.cdlapp.ui;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.cdlapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import Model.Equipment;
import View.AdpterEquipment;


public class Activityequipments extends AppCompatActivity {
    ViewPager viewPager;
    AdpterEquipment adpterEquipment;
    ArrayList<Equipment> Equipments;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    String Url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityequipments);
        Equipments = new ArrayList<>();
        //TODO: equipments e = new equipments;
        Equipments.add(new Equipment(R.drawable.b, "Pc gamer", "It is good", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.f, "Pc gamer", "It is good", "3dt/h"));
        Equipments.add(new Equipment(R.drawable.g, "Pc gamer", "It is good", "3dt/h"));

        adpterEquipment = new AdpterEquipment(Equipments, this);


        try {
            viewPager = findViewById(R.id.viewPager1);
            viewPager.setAdapter(adpterEquipment);
            viewPager.setPadding(130, 0, 130, 0);
            colors = new Integer[]{getResources().getColor(R.color.color1),
                    getResources().getColor(R.color.color2),
                    getResources().getColor(R.color.color3),
                    getResources().getColor(R.color.color4)};

            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    if (position < (adpterEquipment.getCount() - 1) && position < (colors.length - 1)) {
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
        //

    }


    private void jsonGetEquipments() {

        JsonObjectRequest requestEvent = new JsonObjectRequest(Request.Method.GET, Url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //  JsonArray eventArray;
                        try {
                            // JSONArray jsonArrayEvent=new JSONArray(response);
                            JSONArray jsonArrayEvent = response.getJSONArray("events");
                            for (int i = 0; i < (jsonArrayEvent).length(); i++) {
                                JSONObject Event = jsonArrayEvent.getJSONObject(i);
                                String reference = Event.getString("reference");
                                String title = Event.getString("title");
                                String descp = Event.getString("description");
                                String price = Event.getString("price");

                                // Equipment e = new Equipment(parse , );

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();

            }
        }


        );
//        eventQueue.add(requestEvent);
//        adpterEvent = new AdapterEvents(Event, this);
//
//
//        try {
//            viewPager = findViewById(R.id.viewPager1);
//            viewPager.setAdapter(adpterEvent);
//            viewPager.setPadding(130, 0, 130, 0);
//            colors = new Integer[]{getResources().getColor(R.color.color1),
//                    getResources().getColor(R.color.color2),
//                    getResources().getColor(R.color.color3),
//                    getResources().getColor(R.color.color4)};
//
//            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//                @Override
//                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//                    if (position < (adpterEvent.getCount() - 1) && position < (colors.length - 1)) {
//                        viewPager.setBackgroundColor(
//                                (Integer) argbEvaluator.evaluate(positionOffset,
//                                        colors[position],
//                                        colors[position + 1])
//                        );
//                    } else {
//                        viewPager.setBackgroundColor(colors[colors.length - 1]);
//                    }
//
//                }
//
//                @Override
//                public void onPageSelected(int position) {
//
//                }
//
//                @Override
//                public void onPageScrollStateChanged(int state) {
//
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    }
}
