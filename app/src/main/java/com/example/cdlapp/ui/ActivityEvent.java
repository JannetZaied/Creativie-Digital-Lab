package com.example.cdlapp.ui;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.cdlapp.R;

import java.util.ArrayList;

import Model.Events;
import View.AdapterEvents;

public class ActivityEvent extends AppCompatActivity {
    Button Ticket;
    ViewPager viewPager;
    AdapterEvents adpterEvent;
    ArrayList<Events> Events;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    Button AboutUs, Gallery, Contact;
    // String UrlEvent = "http://10.10.29.17:8090/events";
    //private RequestQueue eventQueue;
    // private TextView Title, Desc, Date, Price, Deadline, Formateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
//        Title = findViewById(R.id.titleevent);
//        Desc = findViewById(R.id.descriptionevent);
//        Date = findViewById(R.id.dateevent);
//        Price = findViewById(R.id.priceevent);
//        Deadline = findViewById(R.id.deadline);
//        Formateur = findViewById(R.id.formateur);
        AboutUs = findViewById(R.id.aboutus);
        Gallery = findViewById(R.id.gallery);
        Contact = findViewById(R.id.contact);
        Events = new ArrayList<>();
        Events.add(new Events(R.drawable.ev1, " DIT Station et Live Grading ", " étalonnage en temps réel au  moment du tournage", " Date: 01/09/2019", "Price :10dt", "Deadline to Apllly: 20/08/2019", "Coach: Slim Larnaout"));
        Events.add(new Events(R.drawable.ev2, " Creative VFX Days", " Le rôle et l'impact cinématographique sur la nouvelle génération des jeux vidéo", " Date: 03/09/2019", "Price : 10dt", "Deadline to Apllly: 21/08/2019", "Coach: Aymen Selmi"));
        adpterEvent = new AdapterEvents(Events, this);


        try {
            viewPager = findViewById(R.id.viewPager2);
            viewPager.setAdapter(adpterEvent);
            viewPager.setPadding(130, 0, 130, 0);
            colors = new Integer[]{getResources().getColor(R.color.color1),
                    getResources().getColor(R.color.color2),
                    getResources().getColor(R.color.color3),
                    getResources().getColor(R.color.color4)};

            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    if (position < (adpterEvent.getCount() - 1) && position < (colors.length - 1)) {
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
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityEvent.this, ActivityAboutUs.class);
                startActivity(i);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityEvent.this, ActivityContact.class);
                startActivity(i);
            }
        });
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityEvent.this, ActivityGallery.class);
                startActivity(i);
            }

        });


    }

    // eventQueue = Volley.newRequestQueue(this);
//        event.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //jsonGetEvent();
//                System.out.println("hello");
//            }
//        });
}

//    private void jsonGetEvent() {
//
//        JsonObjectRequest requestEvent = new JsonObjectRequest(Request.Method.GET, UrlEvent, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) { // 1 STRING
//                        //  JsonArray eventArray;
//                        try {
//                            // JSONArray jsonArrayEvent=new JSONArray(response);
//                            JSONArray jsonArrayEvent = response.getJSONArray("events");
//                            for (int i = 0; i < (jsonArrayEvent).length(); i++) {
//                                JSONObject Event = jsonArrayEvent.getJSONObject(i);
//
//                                String title = Event.getString("id");//ybadeli el evnt with a title
//                                String date = Event.getString("event_date");
//                                String deadline = Event.getString("deadline_to_applay");
//                                String formateur = Event.getString("formateur_linkedin_url");
//                                String descp = Event.getString("username");//yaamli description
//                                String price = Event.getString("price");
//                                Title.append(title);
//                                Desc.append(descp);
//                                Date.append(date);
//                                Price.append(price);
//                                Formateur.append(formateur);
//                                Deadline.append(deadline);
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
