package com.example.loginactivity;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Register your parse models

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kWKiOgkMdoW04WqpZgXah8jiEjcJs8EO5cGOd3fj")
                .clientKey("CA7jHPyQvCEfgB1VmkTEuBFWyMbXDAhGdnp6QpnZ")
                .server("https://parseapi.back4app.com")
                .build()
        );

        // New test creation of object below
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
