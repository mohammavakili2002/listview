package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity extends AppCompatActivity {

    ListView family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        family=findViewById(R.id.family);

        ArrayList<String> familys= new ArrayList<>();
        familys.add("father");
        familys.add("mother");
        familys.add("sister");
        familys.add("brother");
        familys.add("uncle");
        familys.add("aunt");
        familys.add("boy sister");
        familys.add("boy brother");
        familys.add("boy aunt");
        familys.add("boy uncle");
        familys.add("girl sister");
        familys.add("girl brother");
        familys.add("girl aunt");
        familys.add("girl uncle");
        familys.add("grand father");
        familys.add("grand mother");
        familys.add("wife");
        familys.add("parent");
        familys.add("child");
        familys.add("boy");
        familys.add("girl");
        familys.add("ghazanfar");



        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,familys);
        family.setAdapter(adapter);







    }
}
