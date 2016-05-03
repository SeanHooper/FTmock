package com.zendo.zzz.objects;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sean on 03/05/2016.
 */
public class DBHandler extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "zendo";
    // Contacts table name
    private static final String TABLE_ADS = "ads";
    private static final String TABLE_USERS = "users";
    public static final String TOP_CATEGORY = "TOP_CATEGORY";
    public static final String SUB_CATEGORY = "SUB_CATEGORY";
    public static final String USER_NAME = "USER_NAME";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_ADS + "("
                + USER_NAME + " TEXT," + TOP_CATEGORY + " TEXT,"
                + SUB_CATEGORY + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADS);
// Creating tables again
        onCreate(db);
    }
}
