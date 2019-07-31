package Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdlapp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityFormulaire extends AppCompatActivity {
    Button btn ;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);
        btn=(Button)findViewById(R.id.Register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ActivityFormulaire.this,HomeActivity.class);
                startActivity(i);
            }
        });
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("é")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonPlaceHolderApi= retrofit.create(JsonPlaceHolderApi.class);
        createUser();

    }
    private void createUser(){
        User user = new User("Jannet","Zaied","hhh");
        Call<User>call= jsonPlaceHolderApi.createUser(user);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
