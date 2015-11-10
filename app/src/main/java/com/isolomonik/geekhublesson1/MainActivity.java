package com.isolomonik.geekhublesson1;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initToolbar();
        initNavigationView();

/* Deleted on Lesson5
//        findViewById(R.id.btnLesson1).setOnClickListener(clickListener);
//        findViewById(R.id.btnLesson2).setOnClickListener(clickListener);
//        findViewById(R.id.btnLesson3).setOnClickListener(clickListener);
//        findViewById(R.id.btnLesson4).setOnClickListener(clickListener);
*/

    }


    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.color.primary_dark);
        toolbar.setTitle(R.string.app_name);
        //   toolbar.setLogo(R.drawable.engineering);

        setSupportActionBar(toolbar);
    }

    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.menuLesson1:
                        lesson1();
                        break;
                    case R.id.menuLesson2:
                        lesson2();
                        break;
                    case R.id.menuLesson3:
                        lesson3();
                        break;
                    case R.id.menuLesson4:
                        lesson4();
                        break;
                    case R.id.menuLesson5:
                        lesson5();
                        break;
                    case R.id.menuLesson6:
                        lesson6();
                        break;


                }

                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
/*Deleted on Lesson5
//    private View.OnClickListener clickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()) {
//                case R.id.btnLesson1:
//                    lesson1(v);
//                    break;
//                case R.id.btnLesson2:
//                    lesson2(v);
//                    break;
//                case R.id.btnLesson3:
//                    lesson3(v);
//                    break;
//                case R.id.btnLesson4:
//                    lesson4(v);
//                    break;
//            }
 //       }
  //  };

  */


    public void lesson1() {
        Intent intent = new Intent(this, Lesson1Activity.class);
        startActivity(intent);
    }

    public void lesson2() {
        Intent intent = new Intent(this, Lesson2Activity.class);
        startActivity(intent);
    }

    public void lesson3() {
        Intent intent = new Intent(this, Lesson3Activity.class);
        startActivity(intent);
    }

    public void lesson4() {
        Intent intent = new Intent(this, Lesson4Activity.class);
        startActivity(intent);

    }

    public void lesson5() {
        Intent intent = new Intent(this, Lesson5Activity.class);
        startActivity(intent);
    }

    public void lesson6() {
        Intent intent = new Intent(this, Lesson6Activity.class);
        startActivity(intent);
    }
}
