package com.example.motivationalspeech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SavedCycle extends AppCompatActivity {
    ImageView back_to_previous;

    EditText coreText, Writer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_cycle);
        back_to_previous = findViewById(R.id.back_to_previous);

      // others..

      coreText = findViewById(R.id.core_text_mine);
      Writer = findViewById(R.id.writer);
      Button save = findViewById(R.id.button_Click);




        back_to_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( SavedCycle.this,MainActivity.class);
                startActivity(intent);
                finishAffinity();
                ActivityCompat.finishAffinity(SavedCycle.this);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}