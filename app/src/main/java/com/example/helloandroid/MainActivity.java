package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button clear_btn = (Button) findViewById(R.id.clear_button);
        clear_btn.setOnClickListener(this);
    }

    public void onClick(View v){
        //Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        //t.show();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);

        int id = v.getId();

        String x = tv.getText().toString();

        int lenghtOfString = tv.length();


        if (id == R.id.clear_button) {
            tv.setText(" ");
        } else if(lenghtOfString<=6) {
            if (id == R.id.button_1) {
                tv.setText(x + "1");
            } else if (id == R.id.button_2) {
                tv.setText(x + "2");
            } else if (id == R.id.button_3) {
                tv.setText(x + "3");
            } else if (id == R.id.button_4) {
                tv.setText(x + "4");
            } else if (id == R.id.button_5) {
                tv.setText(x + "5");
            } else if (id == R.id.button_6) {
                tv.setText(x + "6");
            } else if (id == R.id.button_7) {
                tv.setText(x + "7");
            } else if (id == R.id.button_8) {
                tv.setText(x + "8");
            } else if (id == R.id.button_9) {
                tv.setText(x + "9");
            } else if (id == R.id.button_0) {
                tv.setText(x + "0");
            }
        }
    }
}
