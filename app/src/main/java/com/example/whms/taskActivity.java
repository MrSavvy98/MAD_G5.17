package com.example.whms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.whms.R.layout.activity_main;


public class taskActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

    }


    public void assignTask(View view) {
        Intent intent1 = new Intent(this, assign_task.class);
        startActivity(intent1);
    }
}
