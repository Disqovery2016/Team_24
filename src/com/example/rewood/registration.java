package com.example.rewood;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.renderscript.Type;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends  Activity {

		loginDataBaseAdapter loginDataBaseAdapter;
		 Button btn;
		 private SQLiteDatabase sd;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
		     loginDataBaseAdapter=new LoginDataBaseAdapter(this);
		     loginDataBaseAdapter=loginDataBaseAdapter.open();
		     
		     btn = (Button)findViewById(R.id.btreg);
		  
			    final  EditText editTextFirstName=(EditText)findViewById(R.id.etfname);
			    final  EditText editTextUsername=(EditText)findViewById(R.id.etvname);
			    final  EditText editmobile=(EditText)findViewById(R.id.etcontact);
			    final  EditText editstate=(EditText)findViewById(R.id.etstate);
			    final  EditText editTextPassword=(EditText)findViewById(R.id.etpassword);
			    final  EditText editConfirmPassword=(EditText)findViewById(R.id.etconpass);
			    
			    btn.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if (Type.="Merchant")
						String d="insert into merchant values(Firstname.Text,Username.Text,State.Texr,Mobile.text,Type.Text,Password.Text,Confirmpass.Text";
						sd.execSQL(d);
						else
						String d="insert into saler values(Firstname.Text,Username.Text,State.Texr,Mobile.text,Type.Text,Password.Text,Confirmpass.Text";
						sd.execSQL(d);
					}
					
				});
	 }

			    @Override
				protected void onDestroy() {
					// TODO Auto-generated method stub
					super.onDestroy();
			 
					loginDataBaseAdapter.close();
				}
			}

