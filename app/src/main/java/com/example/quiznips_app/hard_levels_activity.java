package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hard_levels_activity extends AppCompatActivity {

    public static int counter=4;
    Button btn,backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_levels);


        ImageView imageView[]=new ImageView[20];
        TextView txt[]=new TextView[20];

        String hold="";
        btn=findViewById(R.id.counter);
        backbutton=findViewById(R.id.easy_levels_back);


        int a1,a3;

        for(a1=21;a1<=40;a1++)
        {
            Integer int_no=new Integer(a1);
            String number_hold=int_no.toString();
            hold="imageView"+number_hold;
            int resID = getResources().getIdentifier(hold, "id", getPackageName());
            imageView[a1-21]=findViewById(resID);
        }

        String hold2="";
        for(a3=8;a3<=27;a3++)
        {
            Integer int_no=new Integer(a3);
            String number_hold=int_no.toString();
            hold2="textView"+number_hold;
            int resID = getResources().getIdentifier(hold2, "id", getPackageName());
            txt[a3-8]=findViewById(resID);
        }

        for(a1=0;a1<=19;a1++)
        {
            imageView[a1].setImageResource(R.drawable.level_lock);
        }

        for(a3=0;a3<=19;a3++)
        {
            txt[a3].setText(" ");
        }


        int a2,a4;
        for (a2 = 0; a2 < counter; a2++)
        {
            imageView[a2].setImageResource(R.drawable.hard_level_button);
            Integer holder=new Integer(a2+1);
            String number=holder.toString();
            txt[a2].setText(number);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter<=19)
                {
                    counter++;

                    int a2;
                    for (a2 = 0; a2 < counter; a2++)
                    {
                        imageView[a2].setImageResource(R.drawable.hard_level_button);
                        Integer holder=new Integer(a2+1);
                        String number=holder.toString();
                        txt[a2].setText(number);
                    }
                }

            }

        });




        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}