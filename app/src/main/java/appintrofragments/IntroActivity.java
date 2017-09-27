package appintrofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.angelo.myapplication.R;
import com.github.paolorotolo.appintro.AppIntro;

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

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
