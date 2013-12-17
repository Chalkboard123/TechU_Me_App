package com.MetalJourny.techumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spinnerTypes=(Spinner) findViewById(R.id.spinner1);
		spinnerTypes.setOnItemSelectedListener(new spinnerClick());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
		
	}
	
	public class spinnerClick implements OnItemSelectedListener{

		@Override
		public void onItemSelected(AdapterView<?> spinner, View view, int index,
				long id) {
			// TODO Auto-generated method stub
			Spinner spinnerFrom=(Spinner) findViewById(R.id.spinner2);
			Spinner spinnerTo=(Spinner)findViewById(R.id.spinner3);

			if (index==0){
				ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getApplicationContext(), R.array.Volume, R.layout.spinner_item);
				adapter.setDropDownViewResource(R.layout.spinner_item);
				spinnerFrom.setAdapter(adapter);
				spinnerTo.setAdapter(adapter);

			} else if(index==1){
				ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getApplicationContext(), R.array.Mass, R.layout.spinner_item);
				adapter.setDropDownViewResource(R.layout.spinner_item);
				spinnerFrom.setAdapter(adapter);
				spinnerTo.setAdapter(adapter);
				
			}else if (index==2){
				ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getApplicationContext(), R.array.Area, R.layout.spinner_item);
				adapter.setDropDownViewResource(R.layout.spinner_item);
				spinnerFrom.setAdapter(adapter);
				spinnerTo.setAdapter(adapter);

			}else if (index==3){
				ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getApplicationContext(), R.array.Length_Width_Distance, R.layout.spinner_item);
				adapter.setDropDownViewResource(R.layout.spinner_item);
				spinnerFrom.setAdapter(adapter);
				spinnerTo.setAdapter(adapter);
				
			}else if (index==4){
				ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getApplicationContext(), R.array.Temperature, R.layout.spinner_item);
				adapter.setDropDownViewResource(R.layout.spinner_item);
				spinnerFrom.setAdapter(adapter);
				spinnerTo.setAdapter(adapter);

				}
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
