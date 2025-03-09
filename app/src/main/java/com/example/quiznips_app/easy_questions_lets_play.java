package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class easy_questions_lets_play extends AppCompatActivity {


    public static FragmentManager fragmentManager;
    
    private String question_to_send, question_number;
    private String String_arr[]=new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_questions_lets_play);

        easy_questions_lets_play obj=new easy_questions_lets_play();

        Intent intent = getIntent();
        String str=intent.getStringExtra("LEVEL_CONFIGURATION");
        int leveL_activate=Integer.parseInt(str);
        int level_activate_copy=leveL_activate;

        fragment_questions_short_e fragment_questions_short_e_v=new fragment_questions_short_e();
        Fragment holder=fragment_questions_short_e_v;

        switch (level_activate_copy)
        {
            case 1:
            {
                question_to_send= "A man travels a distance of 40m in 5s. Calculate the speed (in m/s).";
                question_number="1";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 2:
            {
                question_to_send= "What is the value of (sin θ)^2 + (cos θ)^2 ?";
                question_number="2";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 3:
            {
                question_to_send= "A man travels a distance of 5m along positive direction of X axis then from there turns around and travels 4m. What is final displacement?";
                question_number="3";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 4:
            {
                question_to_send= "What is one-third of 3.9 × 10^13? If it is of form [ a × 10^12], what is the value of a?";
                question_number="4";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 5:
            {
                question_to_send= "A man buys an orange for 10 dollars and sells it for 15 dollars. What is the profit? ";
                question_number="5";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 6:
            {
                question_to_send= "An empty bucket has mass 2kg. Water is poured into the bucket and the mass of the bucket + water becomes 5kg. What is the mass of water poured?";
                question_number="6";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 7:
            {
                question_to_send= "In a bag of 15 apples, 10 are rotten. Find the number of fresh apples. ";
                question_number="7";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 8:
            {
                question_to_send= " A person is riding a motorbike. The speed is 60km/h. What will be the distance travelled by the person in 2 hours? (in km)";
                question_number="8";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 9:
            {
                question_to_send= " If the mass of one spherical stone is 5kg, how many similar spherical stones of the same mass are required to collectively weigh 20kg? " ;
                question_number="9";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 10:
            {
                question_to_send= " How many sides does a triangle have? " ;
                question_number="10";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 11:
            {
                question_to_send= " How many line(s) can pass through two distinct points in space?  " ;
                question_number="11";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 12:
            {
                question_to_send= " Solve for x:   [ 56012 × 78112 × 0 ] = x  " ;
                question_number="12";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
            case 13:
            {
                question_to_send= " Solve for y:     y+16=3y   " ;
                question_number="13";
                String_arr[0]=question_to_send;
                String_arr[1]=question_number;
                holder=new fragment_questions_short_e();
                break;
            }
        }

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.frameLayout)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }

            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            HardFragment hardFragment=new HardFragment();
            fragmentTransaction.add(R.id.frameLayout,holder,null);
            fragmentTransaction.commit();

        }

    }

    public String[] getMyData() {
        return String_arr;
    }
}