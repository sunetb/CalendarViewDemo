package com.example.calendarviewdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Birthday extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        t = findViewById(R.id.bday);

        //Get data from Intent
        Bundle b = getIntent().getExtras();
        String day = b.getString("day");
        String month = b.getString("month");

        //todo test if date and month is today
        t.setText(day + " "  + month + " Hooray!");
    }
}