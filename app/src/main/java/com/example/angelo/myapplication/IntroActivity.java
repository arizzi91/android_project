package com.example.angelo.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import AppIntroFragments.SlideFragment;

/**
 * Created by angelo on 27/09/17.
 */

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(SlideFragment.newInstance(R.layout.slide_fragment,"testo prova ciao"));
        addSlide(SlideFragment.newInstance(R.layout.slide_fragment,"slide 2"));
    }
}
