package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView first,firstway,second,secondway,third,thirdway;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        first = findViewById(R.id.first);
        firstway = findViewById(R.id.fway);
        second = findViewById(R.id.second);
        secondway = findViewById(R.id.sway);
        third = findViewById(R.id.third);
        thirdway= findViewById(R.id.tway);
        
//        first method
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "first it is", Toast.LENGTH_SHORT).show();
            }
        });
        firstway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "first way it is", Toast.LENGTH_SHORT).show();



            }
        });

        //            second method

        second.setOnClickListener(this::onClick);
        secondway.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.second:
                Toast.makeText(this, "Second it is", Toast.LENGTH_SHORT).show();

                break;
            case R.id.sway:
                Toast.makeText(this, "Second Way it is", Toast.LENGTH_SHORT).show();

                break;

        }
    }

    public void thirdClick(View v){
        Toast.makeText(this, "Third it is", Toast.LENGTH_SHORT).show();
    }

    public void thirdWayClick(View v){
        Toast.makeText(this, "Third way it is", Toast.LENGTH_SHORT).show();
    }
}