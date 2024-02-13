package com.example.quickfeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mentertainment,msports,mtechnology;
    PagerAdapter PagerAdapter;
    Toolbar mtoolbar;

    String api = "02cce478d08245a0a3f10285191e78a6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome = findViewById(R.id.home);
        msports = findViewById(R.id.sports);
        mhealth = findViewById(R.id.health);
        mentertainment = findViewById(R.id.entertainment);
        mtechnology = findViewById(R.id.technology);
        mscience = findViewById(R.id.science);

        ViewPager viewpager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include);


        PagerAdapter = new pagerAdapter(getSupportFragmentManager(),6);
        viewpager.setAdapter(PagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition()== 3 || tab.getPosition() == 4 || tab.getPosition() == 5){
                    PagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}