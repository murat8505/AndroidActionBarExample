package com.example;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
			super.onOptionsItemSelected(item);
			switch(item.getItemId())
			{

			case R.id.itemOne:
			Toast.makeText(getBaseContext(), "Share an item", Toast.LENGTH_SHORT).show();
			break;

			case R.id.itemTwo:
			Toast.makeText(getBaseContext(), "Send an item", Toast.LENGTH_SHORT).show();
			break;
			
			}

			return true;
	}
	

}
