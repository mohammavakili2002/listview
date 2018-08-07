package com.ebnesina.mohammad.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button number;
    Button family;
    Button color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.number);
        family=findViewById(R.id.family);
        color=findViewById(R.id.color);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent number= new Intent(MainActivity.this,numberActivity.class);
                startActivity(number);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this,familyActivity.class);
                startActivity(family);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color = new Intent(MainActivity.this,colorActivity.class);
                startActivity(color);

            }
        });
    }
}
