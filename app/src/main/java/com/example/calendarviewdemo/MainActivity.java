package com.example.calendarviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t;
    CalendarView c;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t = findViewById(R.id.tekst);
        t.setText("Sune");
        b = findViewById(R.id.button);
        b.setText("Date in millisec");
        b.setOnClickListener(this);

        c = findViewById(R.id.calendarView);

        c.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                System.out.println("Date selected: "+ dayOfMonth + ":" + month + ":" + year);

                Calendar c = Calendar.getInstance();
                c.set(year, month, dayOfMonth);
                Long event = c.getTimeInMillis();
                t.setText(new Date(event).toString());
            }
        });



    }

    @Override
    public void onClick(View v) {
        t.setText(""+c.getDate());//Don't use getDate()
    }
}