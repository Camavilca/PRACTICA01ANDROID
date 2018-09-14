package com.orlandocamavilca.practica01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class vistaActivityc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_c);
        LinearLayout email = (LinearLayout)findViewById(R.id.EnviarEmail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj =  new Intent(vistaActivityc.this, EmailActivityA.class);
                startActivity(obj);
            }
        });
    }
}
