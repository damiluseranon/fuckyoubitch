package com.twopedal.useranon.todowork;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



/**
 * Created by useranon on 03.04.2018.
 */

public class SQLConnnectH extends SQLiteOpenHelper {

    SQLConnnectH(Context cn) {
        super(cn, "TwoPedalsWork", null, 1);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE  allclients (name VARCHAR, cicle VARCHAR, phone VARCHAR, work VARCHAR, id VARCHAR, indi VARCHAR)");
    }
    public void onUpgrade(SQLiteDatabase db, int old, int newve) {}
}
