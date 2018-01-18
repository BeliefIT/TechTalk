package com.techtalk;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        ActionBarDrawerToggle actionBarDrawerToggle;
        NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        navigationView = findViewById(R.id.navigationv_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this,"You have pressed Home",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_android:
                        Toast.makeText(MainActivity.this,"You havve pressed android",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_ios:
                        Toast.makeText(MainActivity.this,"You have pressed Ios",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_news:
                        Toast.makeText(MainActivity.this,"You have pressed News",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_settings:
                        Toast.makeText(MainActivity.this,"You have pressed Settings",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_aboutus:
                        Toast.makeText(MainActivity.this,"You have pressed aboutus",Toast.LENGTH_LONG).show();
                        break;

                }
                return false;
            }
        });

    }
    private void setUpToolbar()
    {
      drawerLayout=findViewById(R.id.drawerLayout);
      toolbar = findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);

      actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
      drawerLayout.addDrawerListener(actionBarDrawerToggle);
      actionBarDrawerToggle.syncState();
    }
}
