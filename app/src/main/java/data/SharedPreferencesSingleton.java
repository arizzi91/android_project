package data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by angelo on 27/09/17.
 */

public class SharedPreferencesSingleton {
    private static  SharedPreferencesSingleton ourInstance;
    private SharedPreferences mySharedPref;

    public static final String FIRST_START="start";

    public static SharedPreferencesSingleton getInstance(Context context) {
        if(ourInstance==null){
            ourInstance= new SharedPreferencesSingleton(context);
        }
        return ourInstance;
    }

    private SharedPreferencesSingleton(Context context) {
        if(mySharedPref==null){
            mySharedPref=context.getSharedPreferences(context.getPackageName(),Context.MODE_PRIVATE);
        }
    }

    public static SharedPreferencesSingleton setBooleanPreferences(String key, boolean value){
        SharedPreferences.Editor editor= ourInstance.mySharedPref.edit();
        editor.putBoolean(key,value);
        editor.commit();
        return ourInstance;
    }

    public static boolean getBooleanPreferences(String key, boolean value){
        return ourInstance.mySharedPref.getBoolean(key,value);
    }

}
