package edu.skku.map.skku_findlost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    ImageButton login;
    ImageButton sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (ImageButton)findViewById(R.id.login);
        login.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                EditText id = LoginActivity.this.findViewById(R.id.edit_id);
                EditText pw = LoginActivity.this.findViewById(R.id.edit_pw);

                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                intent.putExtra("userid", id.getText().toString());
                intent.putExtra("userpw", pw.getText().toString());
                startActivity(intent);
            }
        });

        sign_up = (ImageButton)findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        //Temporary
        Button tempButton = (Button) findViewById(R.id.temp_button);
        tempButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}