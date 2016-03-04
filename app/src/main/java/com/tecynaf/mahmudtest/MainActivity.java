package com.tecynaf.mahmudtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean odd = true;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.hello_world);
    }

    public void buttonClicked(View v){
        Button button = (Button) v;
        if (odd == true){
            button.setText("heyy");
            tv.setText("Its friday!");
            odd = false;
        }else{
            button.setText("test button");
            tv.setText("I am hungry!");
            odd = true;
        }

    }
}
