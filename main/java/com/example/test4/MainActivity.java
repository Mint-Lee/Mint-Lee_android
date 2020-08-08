package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;
    private Button btn_move;
    private EditText et_test;
    private String str;
    ImageView img_test;
    ListView list;


    // onCreate : 어플을 처음틀었을때 설명하는 주기?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //액티브xml이랑 연결시킴?
        et_id = findViewById(R.id.et_id);
        btn_test = findViewById(R.id.btn_test);
        et_test = findViewById(R.id.et_test);
        img_test = findViewById(R.id.img_test);
        list = findViewById(R.id.list);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        data.add("1번");
        data.add("2번");
        data.add("3번");
        adapter.notifyDataSetChanged();

        img_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"잘생김",Toast.LENGTH_SHORT).show();
            }
        });


        //액티브xml에서 버튼을 눌렀을때 발생시키는 이벤트 적용
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("텍스트 변경되었슴");
            }
        });

        btn_move = findViewById(R.id._btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();  // 텍스트값을 가져와라(입력값을 가져옴), toString은 문자로 변환
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("str",str);   //글자를 메인액티비티2로 보냄
                startActivity(intent); //액티비티 이동
            }
        });


    }
}