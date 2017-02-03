package com.example.anton.controlhomepc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button sendUDP_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendUDP_btn = (Button) findViewById(R.id.sendUDPbutton);
        sendUDP_btn.setOnClickListener(this); //Test

    }

    @Override
    public void onClick(View view) {

    }
}
