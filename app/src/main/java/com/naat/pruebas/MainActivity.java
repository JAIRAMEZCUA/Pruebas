package com.naat.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declara();
    }

    

    public void declara(){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button)
            Toast.makeText(this,"Button 1 ",Toast.LENGTH_LONG).show();
        if(v.getId()==R.id.button2)
            Toast.makeText(getApplicationContext(),"Button 2 ",Toast.LENGTH_LONG).show();
    }
}