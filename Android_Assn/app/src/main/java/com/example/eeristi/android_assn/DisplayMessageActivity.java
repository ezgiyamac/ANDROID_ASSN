package com.example.eeristi.android_assn;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eeristi.android_assn.MainActivity;


public class DisplayMessageActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaymessageactivity);

        Intent intent1 =getIntent();
        String message1=intent1.getStringExtra(MainActivity.EXTRA_MESSAGE1);

        Intent intent2 =getIntent();
        String message2=intent2.getStringExtra(MainActivity.EXTRA_MESSAGE2);

        Intent intent3 =getIntent();
        String message3=intent3.getStringExtra(MainActivity.EXTRA_MESSAGE3);


        String message;
        message = "\nHello " + message1 + ",\n\nI see here that you like " + message2 + " and that you don't like " + message3 + ".\n\nInteresting!";
        //TextView textView1 = new TextView(this);
        TextView textView1 = (TextView)findViewById(R.id.txt_story);
        textView1.setTextSize(30);
        textView1.setTextColor(Color.BLACK);
        textView1.setText(message);
        //setContentView(textView1);   // Bu komut çalışırsa ekrandaki nesneler görünmüyor ve hata veriyor.


        Button btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }



}


