package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //find ids
        TextView textView0= (TextView) findViewById(R.id.textView13);
        TextView textView1= (TextView) findViewById(R.id.textView7);
        TextView textView2= (TextView) findViewById(R.id.textView8);
        TextView textView3= (TextView) findViewById(R.id.textView9);
        TextView textView4= (TextView) findViewById(R.id.textView14);
        TextView textview5= (TextView) findViewById(R.id.textView12);

        Bundle bundle1 = getIntent().getExtras();
        //pass data from bundle
        String breadCrumbs1 = bundle1.getString("BREAD_CRUMBS1");
        String courseName1 = bundle1.getString("COURSE_NAME1");
        String courseLecturer1 = bundle1.getString("COURSE_LECTURER1");
        String courseLevel1 = bundle1.getString("COURSE_LEVEL1");
        String coursePeriod1 =bundle1.getString("COURSE_PERIOD");
        String courseOverview1 = bundle1.getString("COURSE_OVERVIEW1");



        //Set data in textviews
        textView0.setText(breadCrumbs1);
        textView1.setText(courseName1);
        textView2.setText(courseLecturer1);
        textView3.setText(coursePeriod1);
        textView4.setText(courseLevel1);
        textview5.setText(courseOverview1);

        /*create textview to hold the data
        TextView textView = new TextView(this);
        textView.setText(courseName);
        textView.setTextSize(20);
        textView.setTypeface(null, Typeface.BOLD);
        */
    }
}