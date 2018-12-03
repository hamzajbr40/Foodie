package com.dev40.foodie;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class Category_Activity extends AppCompatActivity {
    private Button jams,appitizers,pickles,desserts,pastries,salads,dairy,mDishes;
    private Intent intent;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        jams = (Button) findViewById(R.id.jams_btn);
        appitizers = (Button) findViewById(R.id.appetizers_id);
        pickles = (Button) findViewById(R.id.pickles_btn);
        desserts = (Button) findViewById(R.id.dessert_btn);
        pastries = (Button) findViewById(R.id.pastries_btn);
        salads = (Button) findViewById(R.id.salads_btn);
        dairy = (Button) findViewById(R.id.dairy_btn);
        mDishes = (Button) findViewById(R.id.mdishes_btn);

        //for Navigation bar
        toolbar = (Toolbar)findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void List(View view) {
        intent = new Intent(this, List_Activity.class);

        switch (view.getId()) {

            case R.id.jams_btn: {
                intent.putExtra("list", jams.getText().toString());
                break;
            }
            case R.id.appetizers_id: {
                intent.putExtra("list", appitizers.getText().toString());
                break;
            }
            case R.id.pickles_btn: {
                intent.putExtra("list", pickles.getText().toString());
                break;
            }
            case R.id.dessert_btn: {
                intent.putExtra("list", desserts.getText().toString());
                break;
            }case R.id.pastries_btn: {
                intent.putExtra("list", pastries.getText().toString());
                break;
            }case R.id.salads_btn: {
                intent.putExtra("list", salads.getText().toString());
                break;
            }case R.id.dairy_btn: {
                intent.putExtra("list", dairy.getText().toString());
                break;
            }case R.id.mdishes_btn: {
                intent.putExtra("list", mDishes.getText().toString());
                break;
            }
        }
        startActivity(intent);
    }

    //for hamburger menu button that in the left top corner
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
