package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bar =(BottomNavigationView) findViewById(R.id.bottom_bar);

        getSupportFragmentManager().beginTransaction()
        .replace(R.id.frame,new home())
        .commit();
//        bar.setSelectedItemId(R.id.home);
        bar.setOnNavigationItemSelectedListener(item -> {
            FragmentTransaction trans =getSupportFragmentManager().beginTransaction();
            if (item.getItemId()==R.id.home){
                trans.replace(R.id.frame,new home());
            }else if(item.getItemId()==R.id.profile){
                trans.replace(R.id.frame,new profile());
            }else if(item.getItemId() == R.id.setting){
                trans.replace(R.id.frame,new setting());
            }
            trans.commit();

            return false;
        });

    }
}