package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class q1Activity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        rb1=(RadioButton)findViewById(R.id.radioButton11);
        rb2=(RadioButton)findViewById(R.id.radioButton10);
        rb3=(RadioButton)findViewById(R.id.radioButton9);
        rb4=(RadioButton)findViewById(R.id.radioButton5);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        mInterstitialAd.show();



        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
                mInterstitialAd.show();
                Intent intent=new Intent(q1Activity.this , q2Activity.class);
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
                mInterstitialAd.show();
                MainActivity.finalScore++;
                Intent intent=new Intent(q1Activity.this , q2Activity.class);
                startActivity(intent);
               // finish();

            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb1.setChecked(false);
                rb4.setChecked(false);
                mInterstitialAd.show();
                Intent intent=new Intent(q1Activity.this , q2Activity.class);
                startActivity(intent);
                //finish();


            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb1.setChecked(false);
                mInterstitialAd.show();
                Intent intent=new Intent(q1Activity.this , q2Activity.class);
                startActivity(intent);
                //finish();

            }
        });
    }



}
