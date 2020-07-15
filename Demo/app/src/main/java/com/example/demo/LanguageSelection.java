package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LanguageSelection extends AppCompatActivity {
    Button Eng_button;
    Button Hindi_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languageselection);
        Eng_button = (Button)findViewById(R.id.btn_eng);
        Hindi_button =(Button)findViewById(R.id.btn_Hindi);

        Eng_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageSelection.this, Savemoney.class);
                startActivity(intent);




            }
        });


    }
}