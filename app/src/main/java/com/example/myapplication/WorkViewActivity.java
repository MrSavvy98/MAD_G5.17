package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WorkViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_view);

        ImageView ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TableLayout tableLayout = findViewById(R.id.activityWorkTable);
        tableLayout.setStretchAllColumns(true);
        tableLayout.bringToFront();

     /*   TableRow header =  new TableRow(this);
        TextView h1 = new TextView(this);
        h1.setText("Date");
        TextView h2 = new TextView(this);
        h2.setText("Location");
        TextView h3 = new TextView(this);
        h3.setText("Task");
        TextView h4 = new TextView(this);
        h4.setText("");
        TextView h5 = new TextView(this);
        h5.setText("");

        header.addView(h1);
        header.addView(h2);
        header.addView(h3);
        header.addView(h4);
        header.addView(h5);

        h1.setPadding(20, 20 , 20, 20);
        h2.setPadding(20, 20 , 20, 20);
        h3.setPadding(20, 20 , 20, 20);
        h4.setPadding(20, 20 , 20, 20);
        h5.setPadding(20, 20 , 20, 20);

        tableLayout.addView(header);*/

        /*for(int i = 1; i < 11; i++){
            TableRow tr =  new TableRow(this);
            TextView c1 = new TextView(this);
            c1.setText("Name "+i);
            TextView c2 = new TextView(this);
            c2.setText(String.valueOf(i*10));
            TextView c3 = new TextView(this);
            c3.setText(String.valueOf(2*i));
*/
//row1
        TableRow tr = new TableRow(this);
        ImageView c1 = new ImageView(this);
        c1.setImageResource(R.drawable.tick);
        TextView c2 = new TextView(this);
        c2.setText(String.valueOf("Task 1"));
        TextView c3 = new TextView(this);
        c3.setText(String.valueOf("Create f..."));


        tr.addView(c1);
        tr.addView(c2);
        tr.addView(c3);


        c1.setPadding(20, 20 , 10, 20);
        c2.setPadding(20, 20 , 10, 20);
        c3.setPadding(20, 20 , 10, 20);

        //row2
        TableRow tr1 = new TableRow(this);
        ImageView c11 = new ImageView(this);
        c11.setImageResource(R.drawable.tick);
        TextView c22 = new TextView(this);
        c22.setText(String.valueOf("Task 2"));
        TextView c33 = new TextView(this);
        c33.setText(String.valueOf("Create"));



        tr1.addView(c11);
        tr1.addView(c22);
        tr1.addView(c33);


        c11.setPadding(20, 20 , 20, 20);
        c22.setPadding(20, 20 , 20, 20);
        c33.setPadding(20, 20 , 20, 20);


        //row2
        TableRow tr11 = new TableRow(this);
        TextView c111 = new TextView(this);
        c111.setText("");
        TextView c222 = new TextView(this);
        c222.setText(String.valueOf("Task 3"));
        TextView c333 = new TextView(this);
        c333.setText(String.valueOf("Send Email"));



        tr11.addView(c111);
        tr11.addView(c222);
        tr11.addView(c333);


        c111.setPadding(20, 20 , 20, 20);
        c222.setPadding(20, 20 , 20, 20);
        c333.setPadding(20, 20 , 20, 20);


        tableLayout.addView(tr);
        tableLayout.addView(tr1);
        tableLayout.addView(tr11);
        tableLayout.requestLayout();
    }
}