package com.amirmaaref313.lanf_e.Exersices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.amirmaaref313.lanf_e.R;

public class ExersicesTextActivity extends AppCompatActivity {

    TextView contentTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersices_text);
        contentTextView = (TextView) findViewById(R.id.contentTextView);
        contentTextView.setText(getIntent().getStringExtra("CONTENT"));
    }
}
