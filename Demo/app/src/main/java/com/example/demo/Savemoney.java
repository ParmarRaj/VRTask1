package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Savemoney extends AppCompatActivity {

    TextView Sm_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savemoney);
        Sm_textview = (TextView)findViewById(R.id.txt_changelag);
        String english = getString(R.string.english_str1);
        Sm_textview.setText(english);
    }
}