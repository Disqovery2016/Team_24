//DataBase
package com.example.rewood;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class database1 extends SQLiteOpenHelper {

	private static String dbname="rewood.db";

	public database1(Context context) {
		super(context, dbname , null , 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		String merchant="create table merchant(Firstname Text,Username Text,Mobile Integer,State Text,Type Text,Password Text,Confirmpass Text)";
		arg0.execSQL(merchant);
		
		String saler="create table saler(Firstname Text,Username Text,Mobile Integer,State Text,Type Text,Password Text,Confirmpass Text)";
		arg0.execSQL(saler);
		
		String products="create table products(Productid Text,Productname Text,Price Integer)";
		arg0.execSQL(products);
		
		String admin="create table admin(Firstname Text,Username Text,Password Text,State Text,Mobile Integer)";
		arg0.execSQL(admin);
	
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
