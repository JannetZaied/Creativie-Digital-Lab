package Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdlapp.R;

public class ActivityFormulaire extends AppCompatActivity {
    Button btn ;

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
    }
}
