package com.isolomonik.geekhublesson1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Lesson4PrevFragment extends Fragment {
    static final String TAG = "PrevFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lesson4_prev_fragment, container, false);
    }


}
