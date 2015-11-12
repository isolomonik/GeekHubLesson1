package com.isolomonik.geekhublesson1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Lesson4BtnFragment extends Fragment {

    OnElementClickListener onElementClickListener;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.lesson4btnNext:
                    onElementClickListener.showNext();
                    break;
                case R.id.lesson4btnPrev:
                    onElementClickListener.showPrevious();
                    break;

            }
        }
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onElementClickListener = (OnElementClickListener) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_lesson4_btn, container, false);
        v.findViewById(R.id.lesson4btnNext).setOnClickListener(clickListener);
        v.findViewById(R.id.lesson4btnPrev).setOnClickListener(clickListener);
        return v;
    }


}
