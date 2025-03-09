package com.example.quiznips_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.drawable.ColorDrawable;
import android.media.midi.MidiDeviceInfo;
import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class lets_play extends AppCompatActivity {

    private MeowBottomNavigation bottom_navigation_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_play);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.levels_action_bar_color)));
        getSupportActionBar().setTitle("Levels");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bottom_navigation_view=findViewById(R.id.bottom_navigation_view);
        bottom_navigation_view.add(new MeowBottomNavigation.Model(1,R.drawable.icon));
        bottom_navigation_view.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_bedtime_24));
        bottom_navigation_view.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_bookmark_24));
        bottom_navigation_view.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_notifications_24));
        bottom_navigation_view.add(new MeowBottomNavigation.Model(5,R.drawable.books_));


        replace(new EasyFragment());
        bottom_navigation_view.show(1,true);

        bottom_navigation_view.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId())
                {
                    case 1:
                        replace(new EasyFragment());
                        break;
                    case 2:
                        replace(new MediumFragment());
                        break;
                    case 3:
                        replace(new HardFragment());
                        break;
                    case 4:
                        replace(new ExtremeFragment());
                        break;
                    case 5:
                        replace(new ConceptualFragment());
                        break;
                }
                // YOUR CODES
                return null;
            }
        });


    }

    private void replace(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();

    }


}