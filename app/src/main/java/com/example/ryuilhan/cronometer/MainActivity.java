package com.example.ryuilhan.cronometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button B1;
    LinearLayout LL2;
    Chronometer CM1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL2 = (LinearLayout)findViewById(R.id.LinearLayout2);
        LL2.setBackgroundColor(333300);

        B1 = (Button)findViewById(R.id.button);
        CM1 = (Chronometer)findViewById(R.id.chronometer);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
