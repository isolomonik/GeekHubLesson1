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

        findViewById(R.id.btnLesson1).setOnClickListener(clickListener);
        findViewById(R.id.btnLesson2).setOnClickListener(clickListener);
        findViewById(R.id.btnLesson3).setOnClickListener(clickListener);
        findViewById(R.id.btnLesson4).setOnClickListener(clickListener);


    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnLesson1:
                    lesson1(v);
                    break;
                case R.id.btnLesson2:
                    lesson2(v);
                    break;
                case R.id.btnLesson3:
                    lesson3(v);
                    break;
                case R.id.btnLesson4:
                    lesson4(v);
                    break;
            }
        }
    };
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

    public void lesson4(View view) {
        Intent intent = new Intent(this, Lesson4Activity.class);
        startActivity(intent);
    }
}
