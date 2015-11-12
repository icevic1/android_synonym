package com.victor.orletchi.synonym;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView mText;
    Button mButton;
    Button mButton1;
    Button mButton2;
    Button mChecking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mText = (TextView)findViewById(R.id.mText);
        mButton = (Button) findViewById(R.id.mButton);
        mButton1 = (Button) findViewById(R.id.mButton1);
        mButton2 = (Button) findViewById(R.id.mButton2);
        mChecking = (Button) findViewById(R.id.checking);

       /* mButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view) {
                mText.setText("button 1");
            }
        });*/


//        mButton1.setOnClickListener(this);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.mButton : mText.setText("case button1");break;
                    case R.id.mButton1 : mText.setText("case button2");break;
                    case R.id.mButton2 : mText.setText("case button3");break;
                    case R.id.checking : mText.setText(R.string.buttonText);break; //R.string.button_verifica
                }
            }
        };

        mButton.setOnClickListener(onClickListener);
        mButton1.setOnClickListener(onClickListener);
        mButton2.setOnClickListener(onClickListener);
        mChecking.setOnClickListener(onClickListener);


    }

    public void clickButton2 (View view) {
        mText.setText("button 3");
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

    @Override
    public void onClick(View view) {
        mText.setText("button 2");
    }
}
