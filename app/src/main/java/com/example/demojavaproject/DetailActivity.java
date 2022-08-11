package com.example.demojavaproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            intiViews();
        }
        void intiViews(){
            TextView tv_detail = findViewById(R.id.tv_detail);
            TextView tv_detail2 = findViewById(R.id.tv_detail2);
            String name = getIntent().getStringExtra("name");
            String age = getIntent().getStringExtra("age");
            tv_detail.setText(name);
            tv_detail2.setText(age);
        }
    }