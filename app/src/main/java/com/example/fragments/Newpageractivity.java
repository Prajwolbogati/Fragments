package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.fragments.adapter.ViewPagerAdapter;
import com.example.fragments.fragments.Firstfragment;
import com.example.fragments.fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class Newpageractivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpageractivity);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabTd);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Firstfragment(),"First");
        viewPagerAdapter.addFragment(new SecondFragment(),"Second");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
