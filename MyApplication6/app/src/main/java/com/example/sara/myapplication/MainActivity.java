package com.example.sara.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int H;
    public int MIN;
    public int S;
    public int Y;
    public int MON;
    public int DAY;
    public String AP ;
    public int WDtemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sal = (TextView) findViewById(R.id.year);
        final TextView mah = (TextView)findViewById(R.id.Mounth_of_year);
        final TextView roz = (TextView)findViewById(R.id.day_of_year);
        final TextView ap = (TextView)findViewById(R.id.AP);
        final TextView saat = (TextView)findViewById(R.id.hour_of_clock);
        final TextView daghighe = (TextView)findViewById(R.id.minute_of_clock);
        final TextView saniye = (TextView)findViewById(R.id.second_of_clock);
        final TextView day = (TextView)findViewById(R.id.day);
        final Button click = (Button)findViewById(R.id.click_clock);



        final MediaPlayer yek = MediaPlayer.create(this ,R.raw.c1);
        final MediaPlayer yeko = MediaPlayer.create(this ,R.raw.c1_o);
        final MediaPlayer do = MediaPlayer.create(this ,R.raw.c2);
        final MediaPlayer doo = MediaPlayer.create(this ,R.raw.c1_o);
        final MediaPlayer se = MediaPlayer.create(this ,R.raw.c3);
        final MediaPlayer seo = MediaPlayer.create(this ,R.raw.c3_o);
        final MediaPlayer chahar = MediaPlayer.create(this ,R.raw.c4);
        final MediaPlayer chaharo = MediaPlayer.create(this ,R.raw.c4_o);
        final MediaPlayer panj = MediaPlayer.create(this ,R.raw.c5);
        final MediaPlayer panjo = MediaPlayer.create(this ,R.raw.c5_o);
        final MediaPlayer shish = MediaPlayer.create(this ,R.raw.c6);
        final MediaPlayer  shisho = MediaPlayer.create(this ,R.raw.c6_o);
        final MediaPlayer haft = MediaPlayer.create(this ,R.raw.c7);
        final MediaPlayer hafto = MediaPlayer.create(this ,R.raw.c7_o);
        final MediaPlayer hasht = MediaPlayer.create(this ,R.raw.c8);
        final MediaPlayer hashto = MediaPlayer.create(this ,R.raw.c8_o);
        final MediaPlayer  noh = MediaPlayer.create(this ,R.raw.c9);
        final MediaPlayer  noho = MediaPlayer.create(this ,R.raw.c9_o);
        final MediaPlayer dah = MediaPlayer.create(this ,R.raw.c10);
        final MediaPlayer daho = MediaPlayer.create(this ,R.raw.c10_o);
        final MediaPlayer yazdah = MediaPlayer.create(this ,R.raw.c11);
        final MediaPlayer yazdaho = MediaPlayer.create(this ,R.raw.c11_o);
        final MediaPlayer davazdah = MediaPlayer.create(this ,R.raw.c12);
        final MediaPlayer davazdaho = MediaPlayer.create(this ,R.raw.c12_o);
        final MediaPlayer sizdah = MediaPlayer.create(this ,R.raw.c13);
        final MediaPlayer chahardah = MediaPlayer.create(this ,R.raw.c14);
        final MediaPlayer ponzdah = MediaPlayer.create(this ,R.raw.c15);
        final MediaPlayer shonzdah = MediaPlayer.create(this ,R.raw.c16);
        final MediaPlayer  hiftah = MediaPlayer.create(this ,R.raw.c17);
        final MediaPlayer hejdah = MediaPlayer.create(this ,R.raw.c18);
        final MediaPlayer nozdah = MediaPlayer.create(this ,R.raw.c19);
        final MediaPlayer bist = MediaPlayer.create(this ,R.raw.c20);
        final MediaPlayer bisto = MediaPlayer.create(this ,R.raw.c20_o);
        final MediaPlayer sie = MediaPlayer.create(this ,R.raw.c30);
        final MediaPlayer sieo = MediaPlayer.create(this ,R.raw.c30_o);
        final MediaPlayer chehel = MediaPlayer.create(this ,R.raw.c40);
        final MediaPlayer chehelo = MediaPlayer.create(this ,R.raw.c40_o);
        final MediaPlayer panjah = MediaPlayer.create(this ,R.raw.c50);
        final MediaPlayer panjaho = MediaPlayer.create(this ,R.raw.c50_o);
        final MediaPlayer minute_sound = MediaPlayer.create(this ,R.raw.daghigheh);
        final MediaPlayer hour_sound = MediaPlayer.create(this ,R.raw.saat);

        sclock.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {

                Calendar clock = Calendar.getInstance();
                S = clock.get(Calendar.SECOND);
                MIN = clock.get(Calendar.MINUTE);
                H = clock.get(Calendar.HOUR_OF_DAY);
                DAY = clock.get(Calendar.DAY_OF_MONTH);
                MON = clock.get(Calendar.MONTH);
                Y = clock.get(Calendar.YEAR);

    }
}

        if (S < 10)
            second.setText("0" + String.valueOf(S));
        else
            second.setText(String.valueOf(S));

        if (MIN < 10)
            minute.setText("0" + String.valueOf(MIN));
        else
            minute.setText(String.valueOf(MIN));

        if (H < 10)
        {
            hour.setText("0" + String.valueOf(H));
            AP = "AM";
        }
        else
        {
            if (H < 12)
            {
                hour.setText(String.valueOf(H));
                AP = "AM";
            }
            else if (H == 12)
            {
                hour.setText("12");
                AP = "PM";
            }
            else
            {
                hour.setText("0" + String.valueOf(H-12));
                AP = "PM";
            }
        }
        ap.setText(AP);

        if(DAY < 10)
            day.setText("0" + String.valueOf(DAY));
        else
            day.setText(String.valueOf(DAY));

        if(MON < 10)
            month.setText("0" + String.valueOf(MON));
        else
            month.setText(String.valueOf(MON));

        if(Y < 10)
            year.setText("000" + String.valueOf(Y));
        else if(Y < 100)
            year.setText("00" + String.valueOf(Y));
        else if(Y < 1000)
            year.setText("0" + String.valueOf(Y));
        else
            year.setText(String.valueOf(Y));

        WDtemp = clock.get(Calendar.DAY_OF_WEEK);

        if (clock.get(Calendar.MONDAY) == WDtemp)
        {

            day.setText("MONDAY");
        }
        else if (clock.get(Calendar.TUESDAY) == WDtemp)
        {
            day.setText("TUESDAY");
        }
        else if (clock.get(Calendar.WEDNESDAY) == WDtemp)
        {
            day.setText("WEDNESDAY");
        }
        else if (clock.get(Calendar.THURSDAY) == WDtemp)
        {
            day.setText("THURSDAY");
        }
        else if (clock.get(Calendar.FRIDAY) == WDtemp)
        {
            day.setText("FRIDAY");
        }
        else if (clock.get(Calendar.SATURDAY) == WDtemp)
        {
            day.setText("SATURDAY");
        }
        else if (clock.get(Calendar.SUNDAY) == WDtemp)
        {
            day.setText("SUNDAY");
        }
        hour_sound.start();
        hour_function();
        }
    });
}
