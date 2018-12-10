package com.dev40.foodie;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQuery;
import android.net.Uri;
import android.os.Bundle;

import java.util.Random;

public class DataBaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    Random random = new Random();
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "FoodieDB";
    private static final String TABLE_NAME = "FoodieTable";

    int id = random.nextInt();

    String FirstName;
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    String LastName;
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    String email;
    public void setEmail(String email) {
        this.email = email;
    }

    String phoneNum;
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    String pass;
    public void setPass(String pass) {
        this.pass = pass;
    }

    String passVerification;
    public void setPassVerification(String passVerification) {
        this.passVerification = passVerification;
    }

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION);
        db =getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ( COLUMN_ID INTEGER PRIMARY KEY, FirstName VARCHAR(20), LastName VARCHAR(20), Email VARCHAR(36) , PhoneNumber VARCHAR(25) , Password VARCHAR(20), PasswordVerification VARCHAR(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        // Create tables again
        onCreate(db);
    }

    public void Open(){
        ContentValues cvalues = new ContentValues();
        cvalues.put("COLUMN_ID", id);
        cvalues.put("FirstName", FirstName);
        cvalues.put("LastName", LastName);
        cvalues.put("Email", email);
        cvalues.put("PhoneNumber", phoneNum);
        cvalues.put("Password", pass);
        cvalues.put("PasswordVerification", passVerification);

        db.insert(TABLE_NAME, null, cvalues);
    }

}
