package com.example.satveerkour_c0769247_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
  TextView textView;
  EditText text1;
  EditText text2;
  EditText text3;
  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = findViewById(R.id.textView);
        text1 = findViewById(R.id.name);
        text2 = findViewById(R.id.email);
        text3 = findViewById(R.id.phone);
        button = findViewById(R.id.save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,verified.class);
                startActivity(intent);
            }
        });

    }
}
