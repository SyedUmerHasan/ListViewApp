package com.example.umerhasan.listviewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myArray = {"Syed Umer Hasan","Syeda Sara Hasan" , "Syed Huzaifa Hasan",
        "Syed Osama Hasan", "Syeda Saba Hasan"};
        ListAdapter myAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,
                myArray);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String familyName = "";
//            }
//        });
    }
}
