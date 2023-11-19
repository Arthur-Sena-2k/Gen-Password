package com.example.arthur.password_persistencia

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Banco(context: Context): SQLiteOpenHelper(context, "password.db", null, 1 ){



    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "create table password(" +
                "id integer primary key autoincrement,"+
                "descricao text," +
                "senha text," +
                "data_cri integer," +
                "data_att integer" +
                ")"
        db?.execSQL(sql)
    }
    override fun onUpgrade(db: SQLiteDatabase?, anterior: Int, atual: Int) {
        db?.execSQL("drop table password")
        this.onCreate(db)
    }
}