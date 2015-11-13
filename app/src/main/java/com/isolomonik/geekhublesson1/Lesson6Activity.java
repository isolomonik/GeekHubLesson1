package com.isolomonik.geekhublesson1;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class Lesson6Activity extends AppCompatActivity implements OnElementClickListener {
    private Toolbar toolbar;

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.color.primary_dark);
        toolbar.setTitle(R.string.itemLesson6);
        // toolbar.setLogo(R.drawable.engineering);
//setActionBar(toolbar);
        setSupportActionBar(toolbar);

       getSupportActionBar().setHomeButtonEnabled(true);
 //       getActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState != null)
            position = savedInstanceState.getInt("position");
      //  showDetails(position);

    }

//    void showDetails(int pos) {
//        Lesson6DetailFragment details = (Lesson6DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFrame);
//        if (details == null || details.getPosition() != pos) {
//            details = Lesson6DetailFragment.newInstance(pos);
//            getSupportFragmentManager().beginTransaction().replace(R.id.detailFrame, details).commit();
//        }
//    }


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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", position);
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
