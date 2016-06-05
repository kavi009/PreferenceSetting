package com.example.subba.preferencesetting;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;


public class UserSettingActivity extends PreferenceActivity{

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();

        sharedPrefs.getString("prefUserPassword", "NOPASSWORD");


    }


}
