package com.example.iq_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class scoreActivity extends AppCompatActivity {

    private Button DetailedResult,Retake,Home;
    private TextView score,description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        DetailedResult=(Button)findViewById(R.id.buttonDetailedResult);
        Retake=(Button)findViewById(R.id.buttonRetake);
        Home=(Button)findViewById(R.id.buttonHome);
        score=(TextView) findViewById(R.id.textViewScore);
        description=(TextView)findViewById(R.id.textViewDescription);

        DetailedResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               //if (!premium) {goPremium();}
                //elese DetailedResult.show();
            }
        });

        Retake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent=new Intent(scoreActivity.this , secondActivity.class);
                 startActivity(intent);
                 finishAffinity();
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent=new Intent(scoreActivity.this , MainActivity.class);
                 startActivity(intent);
                 finishAffinity();
            }
        });
        int mScore=MainActivity.finalScore*6;
        if(mScore<70){mScore=70;}
        else if(mScore>170){mScore=170;}
        score.setText(""+mScore);
        if (mScore<90){description.setText("Low");}
        else if ((mScore>=90)&&(mScore<120)){description.setText("Average");}
        else if ((mScore>=120)&&(mScore<140)){description.setText("High");}
        else if (mScore>=140){description.setText("Very High");}



    }
}
