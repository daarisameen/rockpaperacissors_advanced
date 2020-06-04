package com.example.najmus.rps;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        //to create a link use the following code

        TextView text = (TextView) findViewById(R.id.textView);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
