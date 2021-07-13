package com.example.wedmisttraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Tablayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);



        TabLayout tablayout=findViewById(R.id.tabBar);
        TabItem tabchats=findViewById(R.id.tabChats);
        TabItem tabStatus=findViewById(R.id.tabStatus);
        TabItem tabCalls=findViewById(R.id.tabCalls);
        ViewPager viewPager=findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),
                tablayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}