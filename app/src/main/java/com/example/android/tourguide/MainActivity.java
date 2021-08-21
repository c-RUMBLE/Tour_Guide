package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.viewpager);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(
                item -> {
                    if(item.getItemId() == R.id.action_attractions) {
                        viewPager.setCurrentItem(0);
                    }
                    else if(item.getItemId() == R.id.action_parks) {
                        viewPager.setCurrentItem(1);
                    }
                    else if(item.getItemId() == R.id.action_restaurants) {
                        viewPager.setCurrentItem(2);
                    }
                    else if(item.getItemId() == R.id.action_hotels) {
                        viewPager.setCurrentItem(3);
                    }
                    return false;
                });



        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        SimplePagerAdapter adapter = new SimplePagerAdapter(this);

        viewPager.setAdapter(adapter);


        }

}