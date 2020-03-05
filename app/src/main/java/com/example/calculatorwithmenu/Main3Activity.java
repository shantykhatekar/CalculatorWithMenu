package com.example.calculatorwithmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
TextView txtContext,txtContext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtContext=findViewById(R.id.txt_context);
        registerForContextMenu(txtContext);
        txtContext2=findViewById(R.id.txt_context2);
        registerForContextMenu(txtContext2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu,menu);
        getMenuInflater().inflate(R.menu.menu_calculator,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mn_view:
                Toast.makeText(Main3Activity.this,"View",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_edit:
                Toast.makeText(Main3Activity.this,"Edit",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_delete:
                Toast.makeText(Main3Activity.this,"Delete",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_add:
                Toast.makeText(Main3Activity.this,"Addition",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_sub:
                Toast.makeText(Main3Activity.this,"Substraction",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_mul:
                Toast.makeText(Main3Activity.this,"Multiplication",Toast.LENGTH_LONG).show();
                break;
            case R.id.mn_div:
                Toast.makeText(Main3Activity.this,"Division",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
