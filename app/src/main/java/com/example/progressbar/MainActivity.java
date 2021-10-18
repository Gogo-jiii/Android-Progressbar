package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {

    Button button;
    CircularProgressIndicator circularProgressIndicator;
    LinearProgressIndicator linearProgressIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnShowProgressbars);
        circularProgressIndicator = findViewById(R.id.circularProgressIndicator);
        linearProgressIndicator = findViewById(R.id.linearProgressIndicator);

        circularProgressIndicator.setIndicatorDirection(CircularProgressIndicator.
                INDICATOR_DIRECTION_COUNTERCLOCKWISE);
        circularProgressIndicator.setIndicatorSize(150);
        circularProgressIndicator.setTrackThickness(10);
        circularProgressIndicator.setIndeterminate(true);
        circularProgressIndicator.setIndicatorColor(getResources().getColor(R.color.orange));

        linearProgressIndicator.setIndicatorDirection(LinearProgressIndicator.
                INDICATOR_DIRECTION_RIGHT_TO_LEFT);
        linearProgressIndicator.setIndicatorColor(getResources().getIntArray(R.array.progress_colors));
        linearProgressIndicator.setIndeterminate(true);
        linearProgressIndicator.setIndeterminateAnimationType(LinearProgressIndicator.
                INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circularProgressIndicator.setVisibility(View.VISIBLE);
                linearProgressIndicator.setVisibility(View.VISIBLE);
            }
        });
    }
}