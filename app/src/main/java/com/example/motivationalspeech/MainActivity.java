package com.example.motivationalspeech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.motivationalspeech.fragments_packages.Inspirations;
import com.example.motivationalspeech.fragments_packages.Love_Relations;
import com.example.motivationalspeech.fragments_packages.Reality;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
  //  public boolean onBackButtonPressed = false;

    CardView CARD_CLICK_TO_SAVED_DATA_ACTIVITY;
    CardView click_to_see_myself_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView =(BottomNavigationView)findViewById(R.id.bottom_navigation_display) ;
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.display_frame,new Reality()).commit();
        }

        // bottom navigation item selection code...

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                item.setChecked(true).setEnabled(true);

                try{ switch (item.getItemId()) {
                    case R.id.display_reality:
                        fragment = new Reality();


                        break;
                    case R.id.love_messages:
                        fragment = new Love_Relations();


                        break;
                    case R.id.inspirations:
                        fragment = new Inspirations();

                }

                }

                catch (Exception e){
                }

                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_bottom,R.anim.do_nothing,R.anim.do_nothing,R.anim.slide_out_bottom).replace(R.id.display_frame,fragment).commit();
                return false;
            }

        });




      CARD_CLICK_TO_SAVED_DATA_ACTIVITY = findViewById(R.id.click_to_add_personal);
      CARD_CLICK_TO_SAVED_DATA_ACTIVITY.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, SavedCycle.class);
              startActivity(intent);
              finishAffinity();
              ActivityCompat.finishAffinity(MainActivity.this);
              overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
          }
      });



      click_to_see_myself_detail = findViewById(R.id.click_to_see_myself_detail);
      click_to_see_myself_detail.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, Ourself.class);
              startActivity(intent);
              finishAffinity();
              ActivityCompat.finishAffinity(MainActivity.this);
              overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
          }
      });

    }



}
