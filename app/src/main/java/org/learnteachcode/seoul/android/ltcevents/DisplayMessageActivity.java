package org.learnteachcode.seoul.android.ltcevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //This is a comment

        Intent originIntent = getIntent();
        String message = originIntent.getStringExtra("myuniquemessage");

        TextView textView = (TextView) findViewById(R.id.outputText);
        textView.setText(message);
    }
}
