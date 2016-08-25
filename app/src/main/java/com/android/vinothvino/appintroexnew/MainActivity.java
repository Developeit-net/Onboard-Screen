package com.android.vinothvino.appintroexnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;
import com.github.paolorotolo.appintro.AppIntroFragment;
import android.util.Log;

public class MainActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("oncreate completed","success");

       // int red = getColor(android.R.color.holo_red_light);

        addSlide(AppIntroFragment.newInstance("Developers community","share your ideas.we build apps for you",R.drawable.employee,getResources().getColor(android.R.color.holo_purple)));
        Log.d("slide1","success");
        addSlide(AppIntroFragment.newInstance("Challenging","we code for you",R.drawable.projectable,getResources().getColor(android.R.color.holo_blue_light)));
        Log.d("slide2","success");
        addSlide(AppIntroFragment.newInstance("Get free support","We offer free email support to every developer",R.drawable.support,getResources().getColor(android.R.color.holo_orange_light)));
        Log.d("slide3","success");
        addSlide(AppIntroFragment.newInstance("Octocat","Meow.... It is your friend",R.drawable.octocat,getResources().getColor(android.R.color.holo_green_dark)));
        Log.d("slide4","success");
       // addSlide(new FragmentOne());
        addSlide(AppIntroFragment.newInstance("Android","Linux based Operating System",R.drawable.android,getResources().getColor(R.color.colorAccent)));
        Log.d("slide5","success");


        //Pager Animations

        setFadeAnimation();
        //setZoomAnimation();
        //setFlowAnimation();
        //setSlideOverAnimation();
     //  setDepthAnimation();

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        Intent i = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(i);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }

}

