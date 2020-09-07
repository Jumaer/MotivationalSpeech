package com.example.motivationalspeech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.motivationalspeech.fragments_packages.Inspirations;
import com.example.motivationalspeech.fragments_packages.Love_Relations;
import com.example.motivationalspeech.fragments_packages.Reality;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
  //  public boolean onBackButtonPressed = false;

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


    }



}
