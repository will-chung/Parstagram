package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wnIPBHRZR9zEKzCvdTVdSaJBkLjB9Du5w7e66Mk4")
                .clientKey("m9bNXG7lFmAec5CRIwkOM5Yfka8Pc3glfARDcp8w")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
