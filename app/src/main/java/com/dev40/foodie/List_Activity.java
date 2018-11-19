package com.dev40.foodie;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class List_Activity extends AppCompatActivity {
    ArrayList<String> jams,appitizers,pickles,desserts,pastries,salads,dairy,mDishes;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        jams = new ArrayList<>();
        appitizers = new ArrayList<>();
        pickles = new ArrayList<>();
        desserts = new ArrayList<>();
        pastries = new ArrayList<>();
        salads = new ArrayList<>();
        dairy = new ArrayList<>();
        mDishes = new ArrayList<>();
        getLists();
        String listName = getIntent().getStringExtra("list");
        ListView listView = (ListView)findViewById(R.id.List1);

        switch (listName){

            case "Desserts":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    desserts
            );
            break;
        }
            case "Main Dishes":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    mDishes
            );
            break;
        }
            case "Jams":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    jams
            );
            break;
        }
            case "Pickles":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    pickles
            );
            break;
        }
            case "Pastries":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    pastries
            );
            break;
        }
            case "Appetizers":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    appitizers
            );
            break;
        }
            case "Salads":
        {
            adapter=new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    salads
            );
            break;
        }
            case "Dairy":
        {
            adapter=new ArrayAdapter<String>(
                    this,
                    android.R.layout.simple_list_item_1,
                    dairy
            );
            break;
        }
        }
        listView.setAdapter(adapter);

        EditText search = (EditText)findViewById(R.id.search_bar);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List_Activity.this.adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    protected void getLists(){

        appitizers.add("Mac & Cheese Balls");
        appitizers.add("Yalanji");
        appitizers.add("Veggie Spring Rolls");
        appitizers.add("Musakhan Rolls");
        appitizers.add("Kumpir Potato Pie");
        appitizers.add("Hummus");
        appitizers.add("Kibbeh");
        appitizers.add("Baba Ghanoush");

        salads.add("Traditional Burgul Tabouleh");
        salads.add("Quinoa & Beetroots Tabouleh");
        salads.add("Rocca Salad");
        salads.add("Grilled Chicken Ceasar Salad");
        salads.add("Traditional Green Salad (with Halloumi Cheese)");

        desserts.add("Red Velvet Cookies");
        desserts.add("Strawberry with Chocolate Cookies");
        desserts.add("Red Velvet Brownies");
        desserts.add("Apple Bie");
        desserts.add("Cheesecake");
        desserts.add("Blueberry Charlotte");
        desserts.add("Tiramisu Cake");

        pickles.add("Cucumber Pickle");
        pickles.add("Black Olives");
        pickles.add("Green Olives");
        pickles.add("Turnip Pickle");
        pickles.add("Mixed Pickle");

        jams.add("Peach Jam");
        jams.add("Apple Jam");
        jams.add("Blueberry Orange Marmalade");
        jams.add("Apple Pie Jam");
        jams.add("Cherry Preserves");
        jams.add("Cranberry Pear Jam");
        jams.add("Strawberry Jam");
        jams.add("Blackberry Jam");
        jams.add("Mango Raspberry Jam");

        pastries.add("Pizza");
        pastries.add("Zaatar Roll");
        pastries.add("Hot Dog");
        pastries.add("Spinach");
        pastries.add("Croissant");

        dairy.add("Butter");
        dairy.add("Cheddar Cheese");
        dairy.add("Parmesan Cheese");
        dairy.add("Milk");
        dairy.add("Mozzarella Cheese");
        dairy.add("Yoghurt");

        mDishes.add("Mansaf");
        mDishes.add("Mandi");
        mDishes.add("Kabsa");
        mDishes.add("Biryani");
        mDishes.add("Chicken Tikka");
    }


}
