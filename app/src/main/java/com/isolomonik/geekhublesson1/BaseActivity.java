package com.isolomonik.geekhublesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ira on 30.10.15.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected Lesson4BtnFragment lesson4BtnFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson4);
        if (isAddFragment()) {
            if (savedInstanceState == null) addFragment();

        }
        ;
    }

    abstract boolean isAddFragment();

    void addFragment() {

        lesson4BtnFragment = new Lesson4BtnFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.contBtn, lesson4BtnFragment).commit();
    }

    ;
}
