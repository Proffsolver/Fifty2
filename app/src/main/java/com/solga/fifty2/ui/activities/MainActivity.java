package com.solga.fifty2.ui.activities;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.solga.fifty2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar mToolbar;
    private DrawerLayout mNavigationDrawer;
    private int mDrawerStart=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mNavigationDrawer = (DrawerLayout) findViewById(R.id.navigation_drawer);
        setupToolbar();
        setupDrawer();

    }

    private void setupToolbar(){
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }


    @Override
    public void onBackPressed() {
        // Обработка BackPress
        if (mDrawerStart == 1){
            mDrawerStart = 0;
            mNavigationDrawer.closeDrawer(GravityCompat.START);
        } else {super.onBackPressed();}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            mNavigationDrawer.openDrawer(GravityCompat.START);
            mDrawerStart = 1;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.commands_img:

                break;
            case R.id.main_fab:

                break;
        }
    }


    private void setupDrawer(){
        // Функция установки дровера
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                item.setChecked(true);
                if (item.getItemId() == R.id.commands_menu){
                    mNavigationDrawer.closeDrawer(GravityCompat.START);}
                if (item.getItemId() == R.id.events_menu){
                    // Intent teamIntent = new Intent(MainActivity.this, UserListActivity.class);
                    //  startActivity(teamIntent);
                    mNavigationDrawer.closeDrawer(GravityCompat.START);}
                if (item.getItemId() == R.id.maps_menu){
                    mNavigationDrawer.closeDrawer(GravityCompat.START);}
                if (item.getItemId() == R.id.settings_menu){
                    mNavigationDrawer.closeDrawer(GravityCompat.START);}
                return false;
            }
        });
    }
}
