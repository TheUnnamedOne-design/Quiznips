package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import org.w3c.dom.Text;

public class sploosh extends AppCompatActivity {

    LottieAnimationView anim;
    Animation top;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sploosh);
        anim=(LottieAnimationView)findViewById(R.id.animation_view_student);

        top=AnimationUtils.loadAnimation(this,R.anim.top_animation);
        txt=(TextView)findViewById(R.id.textView_proceed);

        anim.setAnimation(top);
        txt.setAnimation(top);

        btn=(Button)findViewById(R.id.button_to_proceed);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sploosh.this,main_menu.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_up,R.anim.nothing);
                finish();
            }
        });

    }
}