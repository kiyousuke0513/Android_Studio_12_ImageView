package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean State;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.hw1);
    }

    public void IMGV_TRIG(View view) {
        ImageView imageView = findViewById(R.id.imageView);

        if(!State) {
            State = true;
            imageView.setImageResource(R.mipmap.hw1);
        }
        else{
            State = false;
            imageView.setImageResource(R.mipmap.hw2);
        }
    }
}