package com.techtalk;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();

    }
    private void setUpToolbar()
    {
      drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
      toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
      drawerLayout.addDrawerListener(actionBarDrawerToggle);
      actionBarDrawerToggle.syncState();
    }
}
