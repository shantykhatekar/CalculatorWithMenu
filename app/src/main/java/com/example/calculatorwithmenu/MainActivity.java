package com.example.calculatorwithmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.txt_num1);
        num2=findViewById(R.id.txt_num2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_calculator,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        Double Num1=Double.parseDouble(num1.getText().toString());
        Double Num2=Double.parseDouble(num2.getText().toString());
        Double result=0.00;
        Bundle bundle=new Bundle();

        switch (item.getItemId())
        {
            case R.id.mn_add:
                result=Num1+Num2;
            break;
            case R.id.mn_sub:
                result=Num1-Num2;
                break;
            case R.id.mn_mul:
                result=Num1*Num2;
                break;
            case R.id.mn_div:
                result=Num1/Num2;
                break;
        }
        bundle.putDouble("result",result);
        intent.putExtras(bundle);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
