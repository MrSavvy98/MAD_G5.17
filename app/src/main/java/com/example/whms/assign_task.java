package com.example.whms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class assign_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_task);
    }

    public void addTasks(View view2) {
        Intent intent2 = new Intent(this, addTask.class);
        startActivity(intent2);
    }

    public void viewAssigned1(View view3) {
        Intent intent3 = new Intent(this, viewAssigned1.class);
        startActivity(intent3);
    }
}