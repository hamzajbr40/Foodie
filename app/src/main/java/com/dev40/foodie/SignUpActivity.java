package com.dev40.foodie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Intent intent;

    DataBaseHelper db;

    EditText FName;
    EditText LName;
    EditText email;
    EditText phoneNum;
    EditText pass;
    EditText passVerification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }

    public void signUp(View view) {
        int counter =0;
        db = new DataBaseHelper(this, null, null);

        FName = (EditText) findViewById(R.id.firstName);
        LName = (EditText) findViewById(R.id.lastName);
        email = (EditText) findViewById(R.id.emailAddress);
        phoneNum = (EditText) findViewById(R.id.phoneNumber);
        pass = (EditText) findViewById(R.id.password);
        passVerification = (EditText) findViewById(R.id.passwordVerification);
/*
        while (counter == 0) {
            if (FName.getText().toString() == "" || LName.getText().toString() == "" || email.getText().toString() == "" || phoneNum.getText().toString() == "" || pass.getText().toString() == "" || passVerification.getText().toString() == "") {
                Toast.makeText(this, "please fill the blank boxes!!", Toast.LENGTH_LONG).show();
            } else {
                counter++;
            }
        }
*/
        db.setFirstName(FName.getText().toString());
        db.setLastName(LName.getText().toString());
        db.setEmail(email.getText().toString());
        db.setPhoneNum(phoneNum.getText().toString());
        db.setPass(pass.getText().toString());
        db.setPassVerification(passVerification.getText().toString());

        db.Open();
        db.close();

        intent = new Intent(SignUpActivity.this, Category_Activity.class);
        Toast.makeText(this, "You signed up successfully!", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
