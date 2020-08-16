package com.example.workfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Attendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        final Button btn_back = findViewById(R.id.btn_back);
        final Button btn_att = findViewById(R.id.btn_Attendance);
        final Button btn_leave = findViewById(R.id.btn_Leave);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Attendance.this, home.class);
                startActivity(intent);
            }
        });

        btn_att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Attendance.this, MarkAttendance.class);
                startActivity(intent1);
            }
        });

        btn_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Attendance.this, Leave.class);
                startActivity(intent2);
            }
        });
    }
}