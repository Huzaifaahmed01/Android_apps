package com.example.evaluationintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count=0;
    EditText et;
    String name;
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button1);
        et=findViewById(R.id.edittxt);
        num=findViewById(R.id.counter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                num.setText(Integer.toString(count));
                if (count == 7) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent newIntent = new Intent(MainActivity.this, Main2Activity.class);
                            name = et.getText().toString();
                            newIntent.putExtra("Message",name);
                            startActivity(newIntent);
                        }
                    });

                }
            }
        });

    }

}
