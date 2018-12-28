package com.example.umerhasan.listviewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Settings for Toast


        String[] myArray = {"Syed Umer Hasan","Syeda Sara Hasan" , "Syed Huzaifa Hasan",
        "Syed Osama Hasan", "Syeda Saba Hasan"};
        final ListAdapter myAdapter = new MyListViewAdapter(MainActivity.this,myArray);
        final ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String familyName = "You selected " +
                String.valueOf(myListView.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, (String)familyName,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
