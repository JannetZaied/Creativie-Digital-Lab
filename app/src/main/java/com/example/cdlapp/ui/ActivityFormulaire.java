package com.example.cdlapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cdlapp.R;

public class ActivityFormulaire extends AppCompatActivity {
    Button Login;
    ImageButton SignUp;
    EditText name, email, password;
    RadioButton student, entrepreneur;
    RadioGroup group;
    boolean st ,ent;
    String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);
        SignUp = findViewById(R.id.signUp);
        Login = findViewById(R.id.login_redirect);
        name = findViewById(R.id.nameEditText);
        email = findViewById(R.id.emailEditText);
        password = findViewById(R.id.passwordEditText);
        student = findViewById(R.id.studentCheck);
        entrepreneur = findViewById(R.id.entrepreneur);
        group = findViewById(R.id.group);
        st=student.isChecked();
        ent=entrepreneur.isChecked();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityFormulaire.this, ActivityLogin.class);
                startActivity(i);
            }
        });


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if the email exists already + buttons checked , bla bla , I can precise for every input if i have enough time
                // i can do them in boolean methods / function too , i will see

                 if(!(email.getText().toString().isEmpty())&&(email.getText().toString().trim().matches(emailPattern))&&!(name.getText().toString().isEmpty())&& !(password.getText().toString().isEmpty()))
                          {
                              Intent i= new Intent(ActivityFormulaire.this, HomeActivity.class);
                              startActivity(i);

                          }


                else {
//
                     Toast.makeText(ActivityFormulaire.this,"Verify your inputs please",Toast.LENGTH_SHORT).show();

                }
//              //recuperation des donnée
               name.getText();
               email.getText();
               password.getText();
               st=student.isChecked();
               ent=entrepreneur.isChecked();}





                });
        }}
//********sending a request to the api in the back end to verify if the email exits already and blabla ..and then getiing the confirmation back
//    public void SignUpVerif(View view)
//    {
//        RequestQueue requestSignUp= Volley.newRequestQueue(ActivityFormulaire.this);
//        String UrlSignUp="";//Url from hedi
//        StringRequest postRequestSignUp= new StringRequest(Request.Method.POST, UrlSignUp,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.d("APPLOG",response);
//                        JsonSignUp(response);
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
//            answer.put("post-name"name.getText().toString().trim());
//            answer.put("post-mail",email.getText().toString().trim());
//            answer.put("post-pass",password.getText().toString().trim());
//            return answer;
//
//                }
//        };
//
//requestSignUp.add(postRequestSignUp);
//    }
//
//
//
//    public void JsonSignUp(String jsonSignUp
//    {
//        JSONObject jsonObject =null;
//        try {
//            jsonObject = new JSONObject(jsonSignUp);
//            if (jsonObject.get("SignUp").equals("ok")) {//selon code hedi (backend)
//                Toast.makeText(this,"Welcome To Creative Digital Lab",Toast.LENGTH_LONG).show();
//                SignUp.setOnClickListener(new View.OnClickListener() {
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
//            else if (jsonObject.get("SignUp").equals("exists"))
//            {Toast.makeText(this,"This email is already Used , Try again",Toast.LENGTH_LONG).show();}
//            else { Toast.makeText(this,"SignUp failed,verifiy your inputs",Toast.LENGTH_LONG).show();
//                      }
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//}}