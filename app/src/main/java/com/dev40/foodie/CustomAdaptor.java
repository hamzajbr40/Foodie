package com.dev40.foodie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class CustomAdaptor extends ArrayAdapter<String> {

    Context myContext;
    ArrayList<String> myAdaptedNamesArrayList;
    ArrayList<Integer> myAdaptedPicsArrayList;

    //the constructor gets 3 parameters: the name of class that is making the object, the namesArrayList and the picsArrayList
    public CustomAdaptor( Context context, ArrayList<String> adaptedNamesArrayList, ArrayList<Integer> adaptedPicsArrayList) {
        super(context, R.layout.customadapter, adaptedNamesArrayList);
        myAdaptedNamesArrayList = adaptedNamesArrayList;
        myAdaptedPicsArrayList = adaptedPicsArrayList;
        myContext = context;
    }

    //this get the design from the customadaptor layout and view it in each row in the listView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.customadapter, null);
        TextView textView = (TextView) convertView.findViewById(R.id.cATV);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.cAIV);
        textView.setText(myAdaptedNamesArrayList.get(position));
        imageView.setBackgroundResource(myAdaptedPicsArrayList.get(position));
        return convertView;
    }
}