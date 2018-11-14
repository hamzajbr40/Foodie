package com.dev40.foodie;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Category_Activity extends AppCompatActivity {
    Button jams,appitizers,pickles,desserts,pastries,salads,dairy,mDishes;
    Intent intent;
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
    }

    public void List(View view) {
        intent = new Intent(this, List_Activity.class);

        switch (view.getId()) {

            case (R.id.jams_btn):
                {
                intent.putExtra("list", jams.getText().toString());
            }case(R.id.appetizers_id): {
                intent.putExtra("list", appitizers.getText().toString());
            }case (R.id.pickles_btn): {
                intent.putExtra("list", pickles.getText().toString());
            }case (R.id.dessert_btn): {
                intent.putExtra("list", desserts.getText().toString());
            }case (R.id.pastries_btn): {
                intent.putExtra("list", pastries.getText().toString());
            } case (R.id.salads_btn): {
                intent.putExtra("list", salads.getText().toString());
            }case (R.id.dairy_btn): {
                intent.putExtra("list", dairy.getText().toString());
            }case  (R.id.mdishes_btn): {
                intent.putExtra("list", mDishes.getText().toString());
            }
        }
        startActivity(intent);
    }
}
