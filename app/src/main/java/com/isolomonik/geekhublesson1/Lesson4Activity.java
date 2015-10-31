package com.isolomonik.geekhublesson1;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class Lesson4Activity extends BaseActivity implements ShowType {


    public Lesson4NextFragment lesson4NextFragment;
    public Lesson4PrevFragment lesson4PrevFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lesson4NextFragment = new Lesson4NextFragment();
        lesson4PrevFragment = new Lesson4PrevFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.container, lesson4PrevFragment).commit();
    }

    @Override
    boolean isAddFragment() {
        return true;
    }

    @Override
    public void showNext() {
        //  if (!fragmentManager. findFragmentByTag(Lesson4NextFragment.TAG).isInLayout() ) {
        //      fragmentManager.beginTransaction().add(R.id.container, lesson4NextFragment).commit();
        //   } else {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, lesson4NextFragment).commit();
        //  }
    }

    @Override
    public void showPrevious() {
        //     if (fragmentManager.findFragmentByTag(Lesson4PrevFragment.TAG) == null) {
        //        fragmentManager.beginTransaction().add(R.id.container, lesson4PrevFragment).commit();
        //  } else {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, lesson4PrevFragment).commit();
        //  }
    }
}
