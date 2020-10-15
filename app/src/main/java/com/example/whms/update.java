package com.example.whms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class update extends AppCompatActivity {

    Button update;
    public static String update_eid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        update = findViewById(R.id.c_update);
        update.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            Intent update_intent = new Intent(update.this, confirm_update.class);
            TextView textView = findViewById(R.id.deletebtn);
            String updateid = textView.getText().toString();


                update_intent.putExtra(update_eid,updateid);

            startActivity(update_intent);
        }

        });
    }

    public void home(View view10) {
        Intent intent11 = new Intent(this, taskActivity.class);
        startActivity(intent11);
    }


}