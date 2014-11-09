package com.backendless.ucrspoon.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class UserPage extends Activity {
	
	private TextView text_based_search;
	  private EditText search_field;
	  private Button searchButton, logout_button;

	 public void onCreate( Bundle savedInstanceState )
	  {
	    super.onCreate( savedInstanceState );
	    setContentView( R.layout.user_page);
	    

	    Button logout_button = (Button)findViewById(R.id.LogOutButton);    // only records 
        logout_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {				
				onLogoutButtonClicked();
			// TODO Auto-generated method stub
			
			}
		}); // Register the onClick listener with the implementation above
	    
	  }
        private void onLogoutButtonClicked()
        {
          Backendless.UserService.logout( new DefaultCallback<Void>( this )
          {
            @Override
            public void handleResponse( Void response )
            {
              startActivity( new Intent(UserPage.this, MainPage.class ) );
              finish();
            }
          } );    
	    
	    
	  }

}
