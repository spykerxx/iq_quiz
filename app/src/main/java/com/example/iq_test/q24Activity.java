package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class q24Activity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q24);

        rb1=(RadioButton)findViewById(R.id.radioButton11);
        rb2=(RadioButton)findViewById(R.id.radioButton10);
        rb3=(RadioButton)findViewById(R.id.radioButton9);
        rb4=(RadioButton)findViewById(R.id.radioButton5);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                Intent intent=new Intent(q24Activity.this , q25Activity.class);
                startActivity(intent);
                finish();

            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                Intent intent=new Intent(q24Activity.this , q25Activity.class);
                startActivity(intent);
                finish();

            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb1.setChecked(false);
                rb4.setChecked(false);
                Intent intent=new Intent(q24Activity.this , q25Activity.class);
                startActivity(intent);
                finish();

            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb1.setChecked(false);
                MainActivity.finalScore++;
                Intent intent=new Intent(q24Activity.this , q25Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

