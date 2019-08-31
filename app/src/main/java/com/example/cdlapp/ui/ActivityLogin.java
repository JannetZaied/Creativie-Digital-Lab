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
//    public void loginVerif(View view)
//    {
//        RequestQueue requestLogin= Volley.newRequestQueue(ActivityLogin.this);
//        String UrlLogin="";//Url from hedi
//        StringRequest postRequestLogin= new StringRequest(Request.Method.POST, UrlLogin,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.d("APPLOG",response);
//                        JsonLogin(response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.d("APPLOG",error.toString());
//
//                    }
//                }
//                )
//        {     //@Override
//                protected Map<String,String> getAnswer(){
//            Map <String,String> answer= new HashMap<String,String>();
//            answer.put("post-mail",name.getText().toString().trim());
//            answer.put("post-pass",pass.getText().toString().trim());
//            return answer;
//
//                }
//        };
//
//requestLogin.add(postRequestLogin);
//    }
//
//
//
//    public void JsonLogin(String jsonLogin)
//    {
//        JSONObject jsonObject =null;
//        try {
//            jsonObject = new JSONObject(jsonLogin);
//            if (jsonObject.get("LOGIN").equals("ok")) {
//                Toast.makeText(this,"Welcome To CReative Digital Lab",Toast.LENGTH_LONG).show();
//                btn1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//          public void onClick(View view) {
//
//               Intent i = new Intent(ActivityLogin.this, HomeActivity.class);
//               startActivity(i);
//           }
//
//
//     });
//            }
//
//
//            else { Toast.makeText(this,"Login failed,verifiy your inputs",Toast.LENGTH_LONG).show();
//                      }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//}}