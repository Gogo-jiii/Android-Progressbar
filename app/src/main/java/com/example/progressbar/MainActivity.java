package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button button;
    ProgressBar progressBar1, progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnShowProgressbars);
        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar1.setVisibility(View.VISIBLE);
                progressBar2.setVisibility(View.VISIBLE);
            }
        });
    }
}