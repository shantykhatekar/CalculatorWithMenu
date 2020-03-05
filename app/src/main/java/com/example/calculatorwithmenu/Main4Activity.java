package com.example.calculatorwithmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button btnpopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnpopup=findViewById(R.id.btn_popup);
        btnpopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showPopUp(v);
                showMenu(v);
            }
        });
    }
    public void showPopUp(View view){
        PopupMenu popup=new PopupMenu(this,view);
        MenuInflater inflater=popup.getMenuInflater();
        inflater.inflate(R.menu.menu_calculator,popup.getMenu());
        popup.show();
    }
    public void showMenu(View view){
        PopupMenu popup=new PopupMenu(this,view);
        MenuInflater inflater=popup.getMenuInflater();
        //popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
        popup.inflate(R.menu.contextmenu);
       popup.show();
       popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {
               switch (item.getItemId()) {
                   case R.id.mn_view:
                       Toast.makeText(Main4Activity.this, "View", Toast.LENGTH_LONG).show();
                       break;
                   case R.id.mn_edit:
                       Toast.makeText(Main4Activity.this, "Edit", Toast.LENGTH_LONG).show();
                       break;
                   case R.id.mn_delete:
                       Toast.makeText(Main4Activity.this, "Delete", Toast.LENGTH_LONG).show();
                       break;
               }
               return false;
           }
       });
    }


}
