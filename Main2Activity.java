package com.example.evaluationintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView print;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        print=findViewById(R.id.textview2);
        msg=getIntent().getStringExtra("Message");
        print.setText(msg);

    }

}
