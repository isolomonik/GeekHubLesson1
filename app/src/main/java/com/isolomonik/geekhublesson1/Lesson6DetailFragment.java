package com.isolomonik.geekhublesson1;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Lesson6DetailFragment extends Fragment {

    public static Lesson6DetailFragment newInstance(int pos) {
        Lesson6DetailFragment details = new Lesson6DetailFragment();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        details.setArguments(args);
        return details;
    }

    int getPosition() {
        return getArguments().getInt("position", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lesson6_detail, container, false);
        TextView tv = (TextView) v.findViewById(R.id.DetailText);

        Animation animBlink = AnimationUtils.loadAnimation(this.getActivity(), R.anim.blink);
        tv.setText(R.string.Blink);
        tv.startAnimation(animBlink);
        return v;
    }

}
