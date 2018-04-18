package com.examp555le.maryam.myapplication3;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView F = (TextView) findViewById(R.id.F);
        Typeface a = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(a);

        TextView Q = (TextView) findViewById(R.id.Q);
        Typeface b = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(b);

        TextView W = (TextView) findViewById(R.id.W);
        Typeface c = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(c);

        TextView R = (TextView) findViewById(R.id.R);
        Typeface d = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(d);

        TextView T = (TextView) findViewById(R.id.T);
        Typeface A = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(A);

        TextView Y = (TextView) findViewById(R.id.Y);
        Typeface e = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(e);

        TextView U = (TextView) findViewById(R.id.U);
        Typeface f = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(f);

        TextView I = (TextView) findViewById(R.id.I);
        Typeface g = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(g);

        TextView O = (TextView) findViewById(R.id.O);
        Typeface h = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(h);

        TextView P = (TextView) findViewById(R.id.P);
        Typeface i = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(i);

        TextView S = (TextView) findViewById(R.id.S);
        Typeface j = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(j);

        TextView D = (TextView) findViewById(R.id.D);
        Typeface k = Typeface.createFromAsset(getAssets(),
                "fonts/segment7.otf");
        F.setTypeface(k);
    }
}