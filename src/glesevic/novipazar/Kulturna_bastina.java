package glesevic.novipazar;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Kulturna_bastina extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kulturnabas);
		
		TabHost tabHost = getTabHost();
		
		TabSpec pravoslavnaSpec = tabHost.newTabSpec("Pravoslavna");
		pravoslavnaSpec.setIndicator("Pravoslavna");
		Intent pravoslavnaIntent = new Intent(this, Pravoslavna.class);
		pravoslavnaSpec.setContent(pravoslavnaIntent);
		
		TabSpec islamskaSpec = tabHost.newTabSpec("Islamska");
		islamskaSpec.setIndicator("Islamska");
		Intent islamskaIntent = new Intent(this, Islamska.class);
		islamskaSpec.setContent(islamskaIntent);
		
		TabSpec jevrejskaSpec = tabHost.newTabSpec("Jevrejska");
		jevrejskaSpec.setIndicator("Jevrejska");
		Intent jevrejskaIntent = new Intent(this, Jevrejska.class);
		jevrejskaSpec.setContent(jevrejskaIntent);
		
		TabSpec staracarsijaSpec = tabHost.newTabSpec("Stara Carsija");
		staracarsijaSpec.setIndicator("Stara Carsija");
		Intent staracarsijaIntent = new Intent(this, Stara_Carsija.class);
		staracarsijaSpec.setContent(staracarsijaIntent);
		
		
		tabHost.addTab(pravoslavnaSpec);
		tabHost.addTab(islamskaSpec);
		tabHost.addTab(jevrejskaSpec);
		tabHost.addTab(staracarsijaSpec);
		
	}
	
	

}
