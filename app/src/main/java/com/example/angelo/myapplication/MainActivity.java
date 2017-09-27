package com.example.angelo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import interfeces.OnPresenter;
import presenters.PreferencesPresenter;

public class MainActivity extends AppCompatActivity implements OnPresenter{
    PreferencesPresenter preferencesPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferencesPresenter= new PreferencesPresenter(this);
        startApp();

        


    }

    @Override
    public void startApp() {
        preferencesPresenter.startIntroApp(getApplicationContext());
    }
}
