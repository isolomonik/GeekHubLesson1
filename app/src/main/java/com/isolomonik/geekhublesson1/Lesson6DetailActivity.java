package com.isolomonik.geekhublesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class Lesson6DetailActivity extends AppCompatActivity implements OnElementClickListener{
    private Toolbar toolbar;

    public Lesson6DetailFragment lesson6DetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6_detail);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.color.primary_dark);
        toolbar.setTitle(R.string.itemLesson6);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    @Override
    public void showNext() {

    }

    @Override
    public void showPrevious() {

    }

    @Override
    public void itemClick(int position) {

    }
}
