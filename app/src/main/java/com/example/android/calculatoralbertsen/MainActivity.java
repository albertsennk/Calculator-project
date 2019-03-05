package com.example.android.calculatoralbertsen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, equals, divide,
        multiply, polarity, clear, clearAll, decimal;

    EditText output;

    final int NULL = 0;
    final int ADD =1;
    final int SUB = 2;
    final int MUL = 3;
    final int DIV = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiating all the view
        zero = findViewById(R.id.num0);
        one = findViewById(R.id.num1);
        two = findViewById(R.id.num2);
        three = findViewById(R.id.num3);
        four = findViewById(R.id.num4);
        five = findViewById(R.id.num5);
        six = findViewById(R.id.num6);
        seven = findViewById(R.id.num7);
        eight = findViewById(R.id.num8);
        nine = findViewById(R.id.num9);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        equals = findViewById(R.id.equals);
        divide = findViewById(R.id.division);
        multiply = findViewById(R.id.multiplication);
        polarity = findViewById(R.id.polarity);
        clear = findViewById(R.id.clear);
        clearAll = findViewById(R.id.clearAll);
        decimal = findViewById(R.id.decimal);
        output = findViewById(R.id.output);

        // setting the click listeners
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num0));
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num1));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num2));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num3));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num4));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num5));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num6));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num7));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num8));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText() + getString(R.string.num9));
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void equals() {

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
//        savedInstanceState.putInt("count", count);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        count = savedInstanceState.getInt("count");
//        test.setText(Integer.toString(count));
    }
}
