package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private ImageView quickStart,results,mentalTest,moreTests;
    private Button goPremium;
    private AdView adView;
    public static int finalScore=0;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adView = findViewById(R.id.ad_view);
        quickStart=(ImageView)findViewById(R.id.imageViewQuickStart);
        results=(ImageView)findViewById(R.id.imageViewResults);
        mentalTest=(ImageView)findViewById(R.id.imageViewMentalTest);
        moreTests=(ImageView)findViewById(R.id.imageViewMoreTests);
        goPremium=(Button)findViewById(R.id.buttonGoPremium);





        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        goPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInterstitialAd.show();

            }
        });

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

        quickStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this , secondActivity.class);
                startActivity(intent);
                finish();
            }
        });

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this , scoresPageActivity.class);
                startActivity(intent);

            }
        });
    }
}
