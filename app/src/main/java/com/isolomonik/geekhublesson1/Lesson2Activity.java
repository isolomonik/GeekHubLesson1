package com.isolomonik.geekhublesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lesson2Activity extends AppCompatActivity {
    TextView textViewLesson2;
    TextView textResult;
    EditText editTextLesson2;
    Button btnFibonacci;
    Button btnFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson2);
        textViewLesson2 = (TextView) findViewById(R.id.textViewLesson2);
        btnFibonacci = (Button) findViewById(R.id.btnFibonacci);
        btnFactorial = (Button) findViewById(R.id.btnFactorial);
        editTextLesson2 = (EditText) findViewById(R.id.editTextLesson2);
        textResult = (TextView) findViewById(R.id.textResult);


        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(getString(R.string.textResult) + String.valueOf(calcFactorial(Integer.parseInt(editTextLesson2.getText().toString()))));
            }
        });
        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(getString(R.string.textResult) + String.valueOf(calcFibonacci(Integer.parseInt(editTextLesson2.getText().toString()))));
            }
        });
    }

    public static long calcFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }

    public static long calcFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        } else {
            return n * calcFactorial(n - 1);
        }

    }
}
