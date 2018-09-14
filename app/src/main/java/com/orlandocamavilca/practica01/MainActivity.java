package com.orlandocamavilca.practica01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView c1 = (CardView)findViewById(R.id.card1);
        CardView c2 = (CardView)findViewById(R.id.card2);
        CardView c3 = (CardView)findViewById(R.id.card3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj = new Intent(MainActivity.this,vistaActivityA.class);
                startActivity(obj);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj = new Intent(MainActivity.this,vistaActivityb.class);
                startActivity(obj);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj  = new Intent(MainActivity.this, vistaActivityc.class);
                startActivity(obj);
            }
        });
    }
}
