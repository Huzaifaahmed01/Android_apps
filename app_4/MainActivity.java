package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.googlelg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.google.com/");
            }
        });
    }
    public void clicked_btn(String url)
    {
        Intent newIntent= new Intent(Intent.ACTION_VIEW);
        newIntent.setData(Uri.parse(url));
        startActivity(newIntent);

    }
}