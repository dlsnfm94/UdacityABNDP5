package com.example.abndp5bynooralmashhadani;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.abndp5bynooralmashhadani.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        ViewPager viewPager = activityMainBinding.viewPager;
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(categoryAdapter);
        TabLayout tabLayout = activityMainBinding.tabLayout;
        tabLayout.setupWithViewPager(viewPager);
    }
}