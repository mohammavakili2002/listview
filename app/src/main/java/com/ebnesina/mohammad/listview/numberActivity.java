package com.ebnesina.mohammad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class numberActivity extends AppCompatActivity {
    ListView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        number =findViewById(R.id.ls_number);
        ArrayList<Integer> adad = new ArrayList<>();
        for (int i = 0; i <100000; i++) {
            adad.add(i);

        }

        ArrayAdapter<Integer> adab = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,adad);
        number.setAdapter(adab);
    }
}
