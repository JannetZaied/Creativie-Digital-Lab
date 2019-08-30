package com.example.cdlapp.ui;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.cdlapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import Model.Events;
import View.AdapterEvents;

public class Event extends AppCompatActivity {
    Button event;
    ViewPager viewPager;
    AdapterEvents adpterEvent;
    ArrayList<Events> Event;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private TextView Title, Desc, Date, Price;
    private RequestQueue eventQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Title = findViewById(R.id.titleevent);
        Desc = findViewById(R.id.descriptionevent);
        Date = findViewById(R.id.dateevent);
        Price = findViewById(R.id.priceevent);
        event = findViewById(R.id.event);
        eventQueue = Volley.newRequestQueue(this);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jsonGetEvent();
            }
        });
    }

    private void jsonGetEvent() {
        String Url = "";
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
                                String title = Event.getString("title");
                                String date = Event.getString("date");
                                String descp = Event.getString("description");
                                String price = Event.getString("price");
                                Title.append(title);
                                Desc.append(descp);
                                Date.append(date);
                                Price.append(price);


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
        eventQueue.add(requestEvent);
        adpterEvent = new AdapterEvents(Event, this);


        try {
            viewPager = findViewById(R.id.viewPager1);
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
    }
}
