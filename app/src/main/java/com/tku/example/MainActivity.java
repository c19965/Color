package com.tku.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.widget.TextView;
import android.view.View;
import android.text.method.ScrollingMovementMethod;
import android.graphics.Color;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txvR,txvG,txvB,txv;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR = findViewById(R.id.textView2);
        txvG = findViewById(R.id.textView3);
        txvB = findViewById(R.id.textView4);
        txv = findViewById(R.id.textView5);
    }

    public void changeCoilor(View v){
        Random rand= new Random();

        int red = rand.nextInt(256);
        txvR.setText("RED : "+red);
        txvR.setTextColor(Color.rgb(red,0,0));

        int blue = rand.nextInt(256);
        txvB.setText("BLUE : "+blue);
        txvB.setTextColor(Color.rgb(0,0,blue));

        int green = rand.nextInt(256);
        txvG.setText("GREEN : "+green);
        txvG.setTextColor(Color.rgb(0,green,0));

        text += "  "+red + " , " + green + " , "+ blue + "\n";
        txv.setText(text);
        txv.setTextSize(16);
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setBackgroundColor(Color.rgb(red,green,blue));
    }
}
