package glesevic.novipazar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class GalerijaPravo extends Activity {
	
	Gallery galerija;
	ImageView slika;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.galerijaprav);
		galerija = (Gallery) findViewById(R.id.gallery1);
		slika = (ImageView) findViewById(R.id.imageView1);
		galerija.setAdapter(new ImageAdapter1(this));
		
		galerija.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_LONG);
				slika.setImageResource(ImageAdapter1.ThumbsIds[position]);
				
			}
		});
		
	}
	
	

}
