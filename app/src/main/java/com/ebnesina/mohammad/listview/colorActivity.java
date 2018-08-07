package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class colorActivity extends AppCompatActivity {
    ListView colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        colors=findViewById(R.id.lv_color);

        ArrayList<String> color = new ArrayList<>();
        color.add("white");
        color.add("red");
        color.add("yellow");
        color.add("gray");
        color.add("orange");
        color.add("blue");
        color.add("pink");
        color.add("green");
        color.add("black");
        color.add("brown");


        ArrayAdapter<String> adbtor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,color);
        colors.setAdapter(adbtor);


    }
}
