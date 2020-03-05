package com.example.calculatorwithmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result=findViewById(R.id.txt_result);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Double res=bundle.getDouble("result");
        result.setText(String.valueOf(res));
    }
}
