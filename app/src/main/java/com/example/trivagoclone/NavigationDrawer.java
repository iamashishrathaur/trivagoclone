package com.example.trivagoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class NavigationDrawer extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        getSupportActionBar().hide();
        drawerLayout=findViewById(R.id.drawer_layout);
    }
    public void navigation_open(View view) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.END))
        {
            drawerLayout.openDrawer(GravityCompat.END);
        }
        else {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END))
        {
            drawerLayout.closeDrawer(GravityCompat.END);
        }
        else {
            super.onBackPressed();
        }
    }
}