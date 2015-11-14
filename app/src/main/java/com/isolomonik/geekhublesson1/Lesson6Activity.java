package com.isolomonik.geekhublesson1;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class Lesson6Activity extends AppCompatActivity implements OnElementClickListener {

    private Toolbar toolbar;
    public Lesson6ListFragment lesson6ListFragment;
    public Lesson6DetailFragment lesson6DetailFragment;
  //  private FragmentManager fragmentManager;


    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson6);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.color.primary_dark);
        toolbar.setTitle(R.string.itemLesson6);
        setSupportActionBar(toolbar);

       getSupportActionBar().setHomeButtonEnabled(true);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        lesson6ListFragment = (Lesson6ListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);
//
//
//        if (savedInstanceState != null)
//            position = savedInstanceState.getInt("position");
//            showDetails(position);
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

     void showDetails(int pos) {

             lesson6DetailFragment = (Lesson6DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
             if (lesson6DetailFragment == null ) {
                 Intent intent = new Intent(this, Lesson6DetailActivity.class);
                 intent.putExtra("position", position);

                 startActivity(intent);
//                 lesson6DetailFragment = lesson6DetailFragment.newInstance(pos);
//                 getSupportFragmentManager().beginTransaction()
//                         .replace(R.id.cont, lesson6DetailFragment).commit();
             }
          else {
                 //lesson6DetailFragment.setPosition(pos);
                 getSupportFragmentManager().beginTransaction().replace(R.id.detailFragment, lesson6DetailFragment).commit();

         }



    }

    @Override
    public void itemClick(int pos) {
        position = pos;
        showDetails(position);
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("position", position);
//    }

    @Override
    public void showNext() {

    }

    @Override
    public void showPrevious() {

    }


}
