package com.dev40.foodie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    int numberOfQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button plus1= (Button) findViewById(R.id.plus);
        Button minus1= (Button) findViewById(R.id.minus);
        EditText quantity1= (EditText) findViewById(R.id.quantity);
        Button addToCart= (Button) findViewById(R.id.AddToCart);
        }

    public void Plus(View view) {
    numberOfQuantity++;
    Quantity(numberOfQuantity);
    }

    public void Minus(View view) {
        if(numberOfQuantity>0)
        {
            numberOfQuantity--;
        }
        Quantity(numberOfQuantity);
    }

    private void Quantity(int number) {
        EditText quantity1= (EditText) findViewById(R.id.quantity);
        quantity1.setText("" + number);
    }

    public void AddTo(View view) {
        if(numberOfQuantity<=0) {
            Toast.makeText(this,"Cannot add 0 items!",Toast.LENGTH_LONG).show();
        }
    }

}
