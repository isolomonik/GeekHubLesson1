package com.isolomonik.geekhublesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void lesson1(View view) {
        Intent intent = new Intent(this, Lesson1Activity.class);
        startActivity(intent);
    }

    public void lesson2(View view) {
        Intent intent = new Intent(this, Lesson2Activity.class);
        startActivity(intent);
    }

    public void lesson3(View view) {
        Intent intent = new Intent(this, Lesson3Activity.class);
        startActivity(intent);
    }
}
