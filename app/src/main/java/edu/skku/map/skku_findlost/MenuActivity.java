package edu.skku.map.skku_findlost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton report_lost;
    ImageButton report_found;
    ImageButton list_lost;
    ImageButton list_found;
    ImageButton mypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        report_lost = (ImageButton)findViewById(R.id.report_lost);
        report_lost.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MenuActivity.this, ReportLostActivity.class);
                startActivity(intent);
            }
        });

        report_found = (ImageButton)findViewById(R.id.report_found);
        report_found.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MenuActivity.this, ReportFoundActivity.class);
                startActivity(intent);
            }
        });

        list_lost = (ImageButton)findViewById(R.id.list_lost);
        list_lost.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MenuActivity.this, ListLostActivity.class);
                startActivity(intent);
            }
        });

        list_found = (ImageButton)findViewById(R.id.list_found);
        list_found.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MenuActivity.this, ListFoundActivity.class);
                startActivity(intent);
            }
        });

        mypage = (ImageButton)findViewById(R.id.mypage);
        mypage.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MenuActivity.this, ReportLostActivity.class);
                startActivity(intent);
            }
        });
    }
}
