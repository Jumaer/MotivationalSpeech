package com.example.motivationalspeech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ourself extends AppCompatActivity {

    ImageButton add;
    Button leave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ourself);


        add = findViewById(R.id.add_imageButton);
        leave = findViewById(R.id.leave_button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ourself.this, SavedCycle.class);
                startActivity(intent);
                finishAffinity();
                ActivityCompat.finishAffinity(Ourself.this);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ourself.this, MainActivity.class);
                startActivity(intent);
                finishAffinity();
                ActivityCompat.finishAffinity(Ourself.this);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}