package com.example.netclanexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TextView refinetxt;
    private ImageView refinebtn,exploreBtn,networkBtn;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView menubtn = findViewById(R.id.imageView);
        drawerLayout = findViewById(R.id.drawwerlayoutsetting);

        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        exploreBtn = findViewById(R.id.homebutton);
        networkBtn = findViewById(R.id.networkbutton);

        exploreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });



        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.statusbar));

        tabLayout=findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpagemain);

        refinebtn = findViewById(R.id.imageView3);
        refinetxt = findViewById(R.id.refineText);
        refinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RefineActivity.class));
            }
        });
        refinetxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RefineActivity.class));
            }
        });
        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new PersonalFragment(),"PERSONAL");
        vpAdapter.addFragment(new BusinessFragment(),"BUSINESS");
        vpAdapter.addFragment(new MerchantFragment(),"MERCHANT");

        viewPager.setAdapter(vpAdapter);
    }
}