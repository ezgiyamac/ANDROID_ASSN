package com.example.eeristi.android_assn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.eeristi.android_assn.MainActivity;


public class DisplayMessageActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent1 =getIntent();
        String message1=intent1.getStringExtra(MainActivity.EXTRA_MESSAGE1);

        Intent intent2 =getIntent();
        String message2=intent2.getStringExtra(MainActivity.EXTRA_MESSAGE2);

        Intent intent3 =getIntent();
        String message3=intent3.getStringExtra(MainActivity.EXTRA_MESSAGE3);

        String message;

        message = message1 + message2 + message3;

        TextView textView = new TextView(this);
        textView.setTextSize(40);

        textView.setText(message);
        setContentView(textView);
    }



}


