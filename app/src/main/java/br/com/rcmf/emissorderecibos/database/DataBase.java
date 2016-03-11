package br.com.rcmf.emissorderecibos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by renato on 11/03/16.
 */
public class DataBase extends SQLiteOpenHelper {


    public DataBase(Context context) {
        super(context, "CLIENTE", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.getCreateCliente());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
