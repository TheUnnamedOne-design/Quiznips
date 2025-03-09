package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash__opening_animation extends AppCompatActivity {

    LottieAnimationView animationView,animationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_opening_animation);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animationView = (LottieAnimationView) findViewById(R.id.animation_view);

        splash__opening_animation obj=new splash__opening_animation();
        animationView.setRepeatCount(1);
        Thread td=new Thread()
        {
         public void run()
         {
             try
             {
                 sleep(12000);
             }
             catch (Exception ex)
             {
                 ex.printStackTrace();
             }
             finally
             {
                 animationView.animate().translationY(2000).setStartDelay(100).setDuration(1);
                 Intent intent=new Intent(splash__opening_animation.this,sploosh.class);
                 startActivity(intent);

                 finish();
                 overridePendingTransition(R.anim.slide_up,R.anim.nothing);
             }
         }
        };td.start();



        //obj.initial_animation(animationView);//animationView2);


    }
    /**
    public static int controller=0;
    private  void initial_animation(LottieAnimationView anim)
    {
        splash__opening_animation obj2=new splash__opening_animation();

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if(controller==0)
                {
                    controller++;
                    obj2.final_animation(anim);
                }

            }
        }, 11000);

    }

    private void final_animation(LottieAnimationView anim)
    {
        Intent intent=new Intent(splash__opening_animation.this,sploosh.class);
        startActivity(intent);
    }
**/
}

