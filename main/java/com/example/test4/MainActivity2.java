package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sub = findViewById(R.id.sub);

        Intent intent=getIntent();
        String str = intent.getStringExtra("str");  //받는거랑 보내는거 이름 같아야됨 str

        sub.setText(str);
    }
}