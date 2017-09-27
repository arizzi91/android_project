package presenters;

import android.content.Context;
import android.content.Intent;

import appintrofragments.IntroActivity;
import data.SharedPreferencesSingleton;
import interfeces.OnPresenter;



/**
 * Created by angelo on 27/09/17.
 */

public class PreferencesPresenter {
    private final OnPresenter presenter;

    public PreferencesPresenter(OnPresenter presenter) {
        this.presenter = presenter;
    }

    public void startIntroApp(Context context){
        SharedPreferencesSingleton.getInstance(context);
        if(SharedPreferencesSingleton.getBooleanPreferences(SharedPreferencesSingleton.FIRST_START,true)){
            Intent intent = new Intent(context,IntroActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            SharedPreferencesSingleton.setBooleanPreferences(SharedPreferencesSingleton.FIRST_START,false);
        }
    }
}
