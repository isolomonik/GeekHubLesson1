package com.isolomonik.geekhublesson1;


import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Lesson6DetailFragment extends Fragment {
    OnElementClickListener onElementClickListener;
    TextView textView;
int position=0;
//    public static Lesson6DetailFragment newInstance(int pos) {
//        Lesson6DetailFragment details = new Lesson6DetailFragment();
//        Bundle args = new Bundle();
//        args.putInt("position", pos);
//        details.setArguments(args);
//        return details;
//    }
//
    void setPosition(int pos) {
        position=pos;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onElementClickListener = (OnElementClickListener) getActivity();
         }

      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lesson6_detail, container, false);
      textView = (TextView) v.findViewById(R.id.DetailText);
//
     //  Animation animBlink = AnimationUtils.loadAnimation(this.getActivity(), R.anim.blink);
      //   textView.setText(getResources().getStringArray(R.array.headers)[position]);
     //     textView.startAnimation(animBlink);
     return v;
    }


}
