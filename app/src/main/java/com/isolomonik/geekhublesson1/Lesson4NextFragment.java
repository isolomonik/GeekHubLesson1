package com.isolomonik.geekhublesson1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Lesson4NextFragment extends Fragment {

    static final String TAG = "NextFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lesson4_next_fragment, container, false);

    }


}
