package com.example.whms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viewAssigned1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_assigned1);
    }

    public void tasks(View view4) {
        Intent intent4 = new Intent(this, tasks.class);
        startActivity(intent4);
    }
}