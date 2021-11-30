package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView answer;
    EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        answer = findViewById(R.id.answer);
    }

    public void Add(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        Log.i("debug","a confirm");
        int b = Integer.parseInt(num2.getText().toString());
        Log.i("debug","b confirm");
        int result = a+b;
        Log.i("debug","result confirm");
        answer.setText(""+result);
        Log.i("debug","show on textview");
    }
}