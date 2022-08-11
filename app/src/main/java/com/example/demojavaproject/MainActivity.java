package com.example.demojavaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button b_open_details = findViewById(R.id.b_detail);
        b_open_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity();
            }
        });
    }
    void openDetailActivity(){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("name", "Sardor");
        intent.putExtra("age", "22");
        startActivity(intent);
    }
}