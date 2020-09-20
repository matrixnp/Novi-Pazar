package glesevic.novipazar;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class Main extends TabActivity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost tabHost = getTabHost();
		
		TabSpec ograduspec = tabHost.newTabSpec("O Gradu");
		ograduspec.setIndicator("O Gradu");
		Intent ograduIntent = new Intent(this, O_Gradu.class);
		ograduspec.setContent(ograduIntent);
		
		TabSpec kulturnabspec = tabHost.newTabSpec("Kulturna Baština");
		kulturnabspec.setIndicator("Kulturna Baština");
		Intent kulturnabIntent = new Intent(this, Kulturna_bastina.class);
		kulturnabspec.setContent(kulturnabIntent);
		
		TabSpec gdeodsestiSpec = tabHost.newTabSpec("Gde Odsesti");
		gdeodsestiSpec.setIndicator("Gde Odsesti");
		Intent gdeodsestiIntent = new Intent(this, Gde_odsesti.class);
		gdeodsestiSpec.setContent(gdeodsestiIntent);
		
		TabSpec infoSpec = tabHost.newTabSpec("Korisne Informacije");
		infoSpec.setIndicator("Korisne Informacije");
		Intent galerijaIntent = new Intent(this, Korisne_informacije.class);
		infoSpec.setContent(galerijaIntent);
		
		TabSpec kontaktSpec = tabHost.newTabSpec("Kontakt");
		kontaktSpec.setIndicator("Kontakt");
		Intent kontaktIntent = new Intent(this, Kontakt.class);
		kontaktSpec.setContent(kontaktIntent);
		
		
		tabHost.addTab(ograduspec);
		tabHost.addTab(kulturnabspec);
		tabHost.addTab(gdeodsestiSpec);
		tabHost.addTab(infoSpec);
		tabHost.addTab(kontaktSpec);
		
		
		
		
		
		
	}
	

}
