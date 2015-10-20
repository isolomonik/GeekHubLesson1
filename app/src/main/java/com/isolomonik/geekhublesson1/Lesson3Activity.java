package com.isolomonik.geekhublesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Lesson3Activity extends AppCompatActivity {

    private String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile"};

    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson3);

        createAndShowNumbers();

        findViewById(R.id.button_1).setOnClickListener(clickListener);
        findViewById(R.id.button_2).setOnClickListener(clickListener);
        findViewById(R.id.button_3).setOnClickListener(clickListener);
        findViewById(R.id.button_4).setOnClickListener(clickListener);

        text2 = (TextView) findViewById(R.id.text_2);

    }

    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }

    private void reverseOrder() {
        List<String> reverslist = new ArrayList<>(Arrays.asList(values));
        Collections.reverse(reverslist);
        text2.setText(TextUtils.join(", ", reverslist));


    }

    private void removeEveryThird() {
        LinkedList<String> removedlist = new LinkedList<>(Arrays.asList(values));
        Iterator<String> iter = removedlist.listIterator();
        int i = 1;
        while (iter.hasNext()) {
            iter.next();
            if (i % 3 == 0) {
                iter.remove();
            }
            i++;
        }
        text2.setText(TextUtils.join(", ", removedlist));
    }

    private void removeDuplicates() {
        Set<String> set = new HashSet<>(Arrays.asList(values));
        text2.setText(TextUtils.join(", ", set));
    }

    private void sortValues() {
        List<String> sortlist = new ArrayList<>(Arrays.asList(values));
        Collections.sort(sortlist);
        text2.setText(TextUtils.join(", ", sortlist));
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    reverseOrder();
                    break;
                case R.id.button_2:
                    removeEveryThird();
                    break;
                case R.id.button_3:
                    removeDuplicates();
                    break;
                case R.id.button_4:
                    sortValues();
                    break;
            }
        }
    };
}