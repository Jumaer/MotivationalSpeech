package com.example.motivationalspeech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SavedCycle extends AppCompatActivity {
    private Button btnAdd;
    private EditText etTaskEntry;
    private RecyclerView recyclerView;
    private ImageView back_to_previous;
    private TaskAdapter adapter;

    private List<TaskModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_cycle);

        btnAdd = findViewById(R.id.btn_add);
        recyclerView = findViewById(R.id.recyclerview);
        etTaskEntry = findViewById(R.id.et_entry);
        back_to_previous=findViewById(R.id.back_to_previous);

        back_to_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SavedCycle.this, MainActivity.class);
                startActivity(intent);
                finishAffinity();
                ActivityCompat.finishAffinity(SavedCycle.this);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });



        taskList = PrefConfig.readListFromPref(this);

        if (taskList == null)
            taskList = new ArrayList<>();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new TaskAdapter(getApplicationContext(), taskList);
        recyclerView.setAdapter(adapter);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaskModel taskModel = new TaskModel(etTaskEntry.getText().toString(), getDate());
                taskList.add(taskModel);
                PrefConfig.writeListInPref(getApplicationContext(), taskList);
                Collections.reverse(taskList);
                adapter.setTaskModelList(taskList);

                if (!etTaskEntry.getText().equals(""))
                    etTaskEntry.setText("");

            }
        });

    }

    private String getDate() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.valueOf(dateFormat.format(date));
    }
}