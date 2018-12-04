package com.dev40.foodie;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_Activity extends AppCompatActivity {
    ArrayList<String> jams, appetizers,pickles,desserts,pastries,salads,dairy,mDishes;
    ArrayList<Integer> jamsPics, appetizersPics, picklesPics, dessertsPics, pastriesPics, saladsPics, dairyPics, mDishesPics;
    ArrayAdapter<String> adapter;

    CustomAdaptor customAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        jams = new ArrayList<>();
        jamsPics = new ArrayList<>();
        appetizers = new ArrayList<>();
        appetizersPics = new ArrayList<>();
        pickles = new ArrayList<>();
        picklesPics = new ArrayList<>();
        desserts = new ArrayList<>();
        dessertsPics = new ArrayList<>();
        pastries = new ArrayList<>();
        pastriesPics = new ArrayList<>();
        salads = new ArrayList<>();
        saladsPics = new ArrayList<>();
        dairy = new ArrayList<>();
        dairyPics = new ArrayList<>();
        mDishes = new ArrayList<>();
        mDishesPics = new ArrayList<>();
        getLists();
        String listName = getIntent().getStringExtra("list");
        ListView listView = (ListView)findViewById(R.id.List1);

        //getting the name of the clicked button on the previous layout and pass its arrayLists to the customAdaptor constructor
        switch (listName){

            case "Desserts":
        {
            customAdaptor = new CustomAdaptor(this,desserts,dessertsPics);
            break;
        }
            case "Main Dishes":
        {
            customAdaptor = new CustomAdaptor(this,mDishes,mDishesPics);

            break;
        }
            case "Jams":
        {
            customAdaptor = new CustomAdaptor(this,jams,jamsPics);

            break;
        }
            case "Pickles":
        {
            customAdaptor = new CustomAdaptor(this,pickles,picklesPics);

            break;
        }
            case "Pastries":
        {
            customAdaptor = new CustomAdaptor(this,pastries,pastriesPics);

            break;
        }
            case "Appetizers":
        {
            customAdaptor = new CustomAdaptor(this,appetizers,appetizersPics);

            break;
        }
            case "Salads":
        {
            customAdaptor = new CustomAdaptor(this,salads,saladsPics);

            break;
        }
            case "Dairy":
        {
            customAdaptor = new CustomAdaptor(this,dairy,dairyPics);

            break;
        }
        }
        listView.setAdapter(customAdaptor);

        EditText search = (EditText)findViewById(R.id.search_bar);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List_Activity.this.customAdaptor.getFilter().filter(s);
            }


            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    //filling the arrayLists with predefined items
    protected void getLists(){
        //appetizers names
        appetizers.add("Mac & Cheese Balls");
        appetizers.add("Yalanji");
        appetizers.add("Veggie Spring Rolls");
        appetizers.add("Musakhan Rolls");
        appetizers.add("Kumpir Potato Pie");
        appetizers.add("Hummus");
        appetizers.add("Kibbeh");
        appetizers.add("Baba Ghanoush");

        //appetizers Pics
        appetizersPics.add(R.drawable.appitizers_1_mac_cheese_balls);
        appetizersPics.add(R.drawable.appitizers_2_yalanji);
        appetizersPics.add(R.drawable.appitizers_3_veggie_spring_rolls);
        appetizersPics.add(R.drawable.appitizers_4_musakhan_rolls);
        appetizersPics.add(R.drawable.appitizers_5_kumpir_potato_pie);
        appetizersPics.add(R.drawable.appitizers_6_hummus);
        appetizersPics.add(R.drawable.appitizers_7_kibbeh);
        appetizersPics.add(R.drawable.appitizers_8_baba_ghanoush);


        //salads names
        salads.add("Traditional Burgul Tabouleh");
        salads.add("Quinoa & Beetroots Tabouleh");
        salads.add("Rocca Salad");
        salads.add("Grilled Chicken Ceasar Salad");
        salads.add("Traditional Green Salad (with Halloumi Cheese)");

        //salads Pics
        saladsPics.add(R.drawable.salads_1_traditional_burgul_tabouleh);
        saladsPics.add(R.drawable.salads_2_quinoa_beetroots_tabouleh);
        saladsPics.add(R.drawable.salads_3_rocca_salad);
        saladsPics.add(R.drawable.salads_4_grilled_chicken_ceasar_salad);
        saladsPics.add(R.drawable.salads_5_traditional_green_salad);


        //desserts names
        desserts.add("Red Velvet Cookies");
        desserts.add("Strawberry with Chocolate Cookies");
        desserts.add("Red Velvet Brownies");
        desserts.add("Apple Bie");
        desserts.add("Cheesecake");
        desserts.add("Blueberry Charlotte");
        desserts.add("Tiramisu Cake");

        //desserts Pics
        dessertsPics.add(R.drawable.desserts_1_red_velvet_cookies);
        dessertsPics.add(R.drawable.desserts_2_strawberry_with_chocolate_cookies);
        dessertsPics.add(R.drawable.desserts_3_red_velvet_brownies);
        dessertsPics.add(R.drawable.desserts_4_apple_bie);
        dessertsPics.add(R.drawable.desserts_5_cheesecake);
        dessertsPics.add(R.drawable.desserts_6_blueberry_charlotte);
        dessertsPics.add(R.drawable.desserts_7_tiramisu_cake);


        //pickles names
        pickles.add("Cucumber Pickle");
        pickles.add("Black Olives");
        pickles.add("Green Olives");
        pickles.add("Turnip Pickle");
        pickles.add("Mixed Pickle");

        //pickles Pics
        picklesPics.add(R.drawable.pickles_1_cucumber_pickle);
        picklesPics.add(R.drawable.pickles_2_black_olives);
        picklesPics.add(R.drawable.pickles_3_green_olives);
        picklesPics.add(R.drawable.pickles_4_turnip_pickle);
        picklesPics.add(R.drawable.pickles_5_mixed_pickle);


        //jams names
        jams.add("Peach Jam");
        jams.add("Apple Jam");
        jams.add("Blueberry Orange Marmalade");
        jams.add("Apple Pie Jam");
        jams.add("Cherry Preserves");
        jams.add("Cranberry Pear Jam");
        jams.add("Strawberry Jam");
        jams.add("Blackberry Jam");
        jams.add("Mango Raspberry Jam");

        //jams Pics
        jamsPics.add(R.drawable.jams_1_peach_jam);
        jamsPics.add(R.drawable.jams_2_apple_jam);
        jamsPics.add(R.drawable.jams_3_blueberry_orange_marmalade);
        jamsPics.add(R.drawable.jams_4_apple_pie_jam);
        jamsPics.add(R.drawable.jams_5_cherry_preserves);
        jamsPics.add(R.drawable.jams_6_cranberry_pear_jam);
        jamsPics.add(R.drawable.jams_7_strawberry_jam);
        jamsPics.add(R.drawable.jams_8_blackberry_jam);
        jamsPics.add(R.drawable.jams_9_mango_raspberry_jam);


        //pastries names
        pastries.add("Pizza");
        pastries.add("Zaatar Roll");
        pastries.add("Hot Dog");
        pastries.add("Spinach");
        pastries.add("Croissant");

        //pastries Pics
        pastriesPics.add(R.drawable.pastries_1_pizza);
        pastriesPics.add(R.drawable.pastries_2_zaatar_roll);
        pastriesPics.add(R.drawable.pastries_3_hot_dog);
        pastriesPics.add(R.drawable.pastries_4_spinach);
        pastriesPics.add(R.drawable.pastries_5_croissant);


        //dairy names
        dairy.add("Butter");
        dairy.add("Cheddar Cheese");
        dairy.add("Parmesan Cheese");
        dairy.add("Milk");
        dairy.add("Mozzarella Cheese");
        dairy.add("Yoghurt");

        //dairy Pics
        dairyPics.add(R.drawable.dairy_1_butter);
        dairyPics.add(R.drawable.dairy_2_cheddar_cheese);
        dairyPics.add(R.drawable.dairy_3_parmesan_cheese);
        dairyPics.add(R.drawable.dairy_4_milk);
        dairyPics.add(R.drawable.dairy_5_mozzarella_cheese);
        dairyPics.add(R.drawable.dairy_6_yoghurt);


        //MDishes names
        mDishes.add("Mansaf");
        mDishes.add("Mandi");
        mDishes.add("Kabsa");
        mDishes.add("Biryani");
        mDishes.add("Chicken Tikka");

        //MDishes Pics
        mDishesPics.add(R.drawable.mdishes_1_mansaf);
        mDishesPics.add(R.drawable.mdishes_2_mandi);
        mDishesPics.add(R.drawable.mdishes_3_kabsa);
        mDishesPics.add(R.drawable.mdishes_4_biryani);
        mDishesPics.add(R.drawable.mdishes_5_chicken_tikka);
    }


}


