package com.example.rewood;


import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.renderscript.Type;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;
import android.view.Menu;


public class Mainpage extends Activity {
	private String uname;
	private Context context=this;
	private GridView grid;
	private ArrayList<gridpojo> griddata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
grid=(GridView)findViewById(R.id.gridView1);
		griddata=new ArrayList<gridpojo>();
		Bitmap b1=BitmapFactory.decodeResource(this.getResources(),R.drawable.attendance);
		Bitmap b2=BitmapFactory.decodeResource(this.getResources(),R.drawable.msg);
		Bitmap b3=BitmapFactory.decodeResource(this.getResources(),R.drawable.test);
		Bitmap b4=BitmapFactory.decodeResource(this.getResources(),R.drawable.atr);
		Bitmap b5=BitmapFactory.decodeResource(this.getResources(),R.drawable.block);
		Bitmap b6=BitmapFactory.decodeResource(this.getResources(),R.drawable.unblock);
		{
			g.setImg(b3);
		}
		else if (i==3) {
			g.setImg(b4);
		}
		else if (i==4) {for (int i = 0; i < 9; i++) {
		gridpojo g=new gridpojo();
		if(i==0){
			g.setImg(b1);
		}
		else if (i==1) {
			g.setImg(b2);
		}
		else if (i==2) 
			g.setImg(b5);
		}
		else if (i==5) {
			g.setImg(b6);
		}
		else if (i==6) {
			g.setImg(b7);
		}
		else if (i==7) {
			g.setImg(b8);
		}
		else{
			g.setImg(b9);
		}
		griddata.add(g);
	}
	
	grid.setAdapter(new Mycustomeadapter(context,R.layout.image,griddata));
	
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.index, menu);
	return true;
}

}
