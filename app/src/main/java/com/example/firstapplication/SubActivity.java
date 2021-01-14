package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private TextView sub_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        sub_text = findViewById(R.id.sub_text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        sub_text.setText(str);
    }
}