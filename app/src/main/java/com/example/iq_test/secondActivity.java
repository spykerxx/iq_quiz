package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    private Button start;
    private TextView X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        start=(Button)findViewById(R.id.buttonStart);
        X=(TextView)findViewById(R.id.textViewX);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(secondActivity.this , q1Activity.class);
                startActivity(intent);


               finishAffinity();
            }
        });

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(secondActivity.this , MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });
    }





}
