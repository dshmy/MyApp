package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.text.Hello;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText();
        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", " counter =" + count);
        }

    }
    private void displayText(){
        Hello h = new Hello();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(h.getValue());
    }
}