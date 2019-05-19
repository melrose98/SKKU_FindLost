package edu.skku.map.skku_findlost;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ReportLostActivity extends AppCompatActivity {

    Button date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_lost);

        date = (Button)findViewById(R.id.get_date);
        date.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                DialogFragment dialog = new DataPickerFragment();
                dialog.show(getSupportFragmentManager(), "날짜선택");

            }
        });

    }
}
