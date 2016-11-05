package com.example.rewood;

import android.os.Bundle;
import android.os.Message;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText username;
	private EditText password;
	private Button btn1;
	private Button btn2;
	private CheckBox ch1;
	private Message m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialization
        username = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.edit2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btreg);
        
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 // Stores User name
                String username1 = String.valueOf(username.getText());
                // Stores Password
                String password2 = String.valueOf(password.getText());
             // Validates the User name and Password for admin, admin
                if (username.equals("sanjay") && password.equals("sanjay123")) {
                	Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
                } else {
                	Toast.makeText(getApplicationContext(), "Please check the valid user data!", Toast.LENGTH_LONG).show();
                }
			}
		});
        
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
