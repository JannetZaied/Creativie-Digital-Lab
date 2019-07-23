package Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cdlapp.R;

public class ActivityLogin extends AppCompatActivity {
    EditText name;
    EditText pass;
    Button btn1,btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        btn1=(Button)findViewById(R.id.login);
        btn2=(Button)findViewById(R.id.NewUser);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("Jannet")&&pass.getText().toString().equals("1234"))
                { Intent i = new Intent(ActivityLogin.this,HomeActivity.class);
                startActivity(i);}
                else {
                    Toast.makeText(ActivityLogin.this,"Wrong username and password",Toast.LENGTH_LONG).show();
                }


            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ActivityLogin.this,ActivityFormulaire.class);
                startActivity(i);
            }
        });

    }
}
