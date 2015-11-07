package com.isolomonik.geekhublesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Lesson5Activity extends AppCompatActivity {

    TextView animTextView;

    Animation animBlink;
    Animation animBounce;
    Animation animRotate;
    Animation animSlideUp;
    Animation animZoomOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson5);

        findViewById(R.id.btnBlink).setOnClickListener(clickListener);
        findViewById(R.id.btnBounce).setOnClickListener(clickListener);
        findViewById(R.id.btnRotate).setOnClickListener(clickListener);
        findViewById(R.id.btnSlideUp).setOnClickListener(clickListener);
        findViewById(R.id.btnZoomOut).setOnClickListener(clickListener);

        animTextView = (TextView) findViewById(R.id.animTV);

        animBlink = AnimationUtils.loadAnimation(this, R.anim.blink);
        animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        animZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);


    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnBlink:
                    animTextView.setText(R.string.Blink);
                    animTextView.startAnimation(animBlink);
                    break;
                case R.id.btnBounce:
                    animTextView.setText(R.string.Bounce);
                    animTextView.startAnimation(animBounce);
                    break;
                case R.id.btnRotate:
                    animTextView.setText(R.string.Rotate);
                    animTextView.startAnimation(animRotate);
                    break;
                case R.id.btnSlideUp:
                    animTextView.setText(R.string.SlideUp);
                    animTextView.startAnimation(animSlideUp);
                    break;
                case R.id.btnZoomOut:
                    animTextView.setText(R.string.ZoomOut);
                    animTextView.startAnimation(animZoomOut);
                    break;
            }
        }
    };


}
