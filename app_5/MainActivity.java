package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] Dinosaurs={"ankylosaurs","Brontosaurus","setgoraurus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> dinoAdap= new ArrayAdapter<String>(this,R.layout.item,R.id.txt,Dinosaurs);
        ListView dinolist = new ListView(this);

        setContentView(dinolist);
        dinolist.setAdapter(dinoAdap);

    }

}