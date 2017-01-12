package com.sandyz.conttextwithxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] options = {"option1","option2","option3"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.contextmenu,menu);

        super.onCreateContextMenu(menu, v, menuInfo);


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.action1){
            Toast.makeText(this,"Clicked on "+item,Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.action2){
            Toast.makeText(this,"Clicked on "+item,Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.action3){
            Toast.makeText(this,"Clicked on "+item,Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}
