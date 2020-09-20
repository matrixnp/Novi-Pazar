package glesevic.novipazar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GalerijaStara extends Activity {
	
	@SuppressWarnings("deprecation")
	Gallery galerija;
	ImageView slika;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.galerijastara); 
		galerija = (Gallery) findViewById(R.id.gallery4);
		slika = (ImageView) findViewById(R.id.imageView4);
		galerija.setAdapter(new ImageAdapter4(this));
		galerija.setOnItemClickListener(new OnItemClickListener() {

			@SuppressLint("ShowToast")
			@Override
			public void onItemClick(AdapterView<?> adapter, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_LONG);
				slika.setImageResource(ImageAdapter4.ThumbsIds4[position]);
				
			}
		});

}
}
