package com.dev40.foodie;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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

        Button plus1 = (Button) findViewById(R.id.plus);
        Button minus1 = (Button) findViewById(R.id.minus);
        EditText quantity1 = (EditText) findViewById(R.id.quantity);
        Button addToCart = (Button) findViewById(R.id.AddToCart);

        //WE USE THIS CODE WHEN WE HAVE A DATABASE!
        /*
        addToCart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(Detail.this).create();
                alertDialog.setTitle("Error");
                alertDialog.setMessage("You need to login first to order!");

                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        */
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
        //FOR NOW WE USE THIS CODE UNTIL WE HAVE A DATABASE!
        if(numberOfQuantity<=0) {
            Toast.makeText(this,"Cannot add 0 items!",Toast.LENGTH_LONG).show();
        }
        if(numberOfQuantity>0)
        {
            Toast.makeText(this,"Coming soon!",Toast.LENGTH_LONG).show();
        }
    }
}
