package com.example.wonho.tutorial6;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by wonho on 2017-11-08.
 */

public class subActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView nameText = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText").toString());
    }
}
