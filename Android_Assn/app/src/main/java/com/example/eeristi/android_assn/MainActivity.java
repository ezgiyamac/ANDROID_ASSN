package com.example.eeristi.android_assn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public final static  String EXTRA_MESSAGE1="com.example.eeristi.Android_Assn.MESSAGE1";
    public final static  String EXTRA_MESSAGE2="com.example.eeristi.Android_Assn.MESSAGE2";
    public final static  String EXTRA_MESSAGE3="com.example.eeristi.Android_Assn.MESSAGE3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view)
    {
        //Hello this is a comment
        Intent intent = new Intent(this, com.example.eeristi.android_assn.DisplayMessageActivity.class);


        EditText editText1 = (EditText)findViewById(R.id.edit_message1);
        intent.putExtra(EXTRA_MESSAGE1,editText1.getText().toString());


        EditText editText2 = (EditText)findViewById(R.id.edit_message2);
        intent.putExtra(EXTRA_MESSAGE2,editText2.getText().toString());


        EditText editText3 = (EditText)findViewById(R.id.edit_message3);
        intent.putExtra(EXTRA_MESSAGE3,editText3.getText().toString());

        startActivity(intent);
    }





}
