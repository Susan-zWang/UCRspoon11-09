package com.backendless.ucrspoon.login;


import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainPage extends Activity {
	
	//String currentUserId = Backendless.UserService.loggedInUser();   // get the current user ID 
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main_pages);

	        
	        Button login_button = (Button)findViewById(R.id.login_button);    // only records 
	         login_button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {				
				startActivity (new Intent(v.getContext(), LoginActivity.class));   // goes to MyCamera.java
					// TODO Auto-generated method stub
				
				//SharedPreferences prefs = getSharedPreferences("MyApp", MODE_PRIVATE);
		        //currentUserId = prefs.getString("username", "UNKNOWN");

				
				
				}
			}); // Register the onClick listener with the implementation above
	         
	         Button register_button = (Button)findViewById(R.id.register_button);    // only records 
	         register_button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {				
				startActivity (new Intent(v.getContext(), RegisterActivity.class));   // goes to MyCamera.java
					// TODO Auto-generated method stub
				}
			}); // Register the onClick listener with the implementation above
	        
	        
	        
	 }
	
	
	
	

}
