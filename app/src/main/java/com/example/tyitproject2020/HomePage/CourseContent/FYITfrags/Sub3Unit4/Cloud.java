package com.example.tyitproject2020.HomePage.CourseContent.FYITfrags.Sub3Unit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tyitproject2020.R;

public class Cloud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud);
        Intent intent = getIntent();
        String title = intent.getStringExtra("TITLE");
        getSupportActionBar().setTitle(title);
    }
}