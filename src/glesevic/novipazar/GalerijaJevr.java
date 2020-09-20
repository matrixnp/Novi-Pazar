package glesevic.novipazar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GalerijaJevr extends Activity {

	Gallery galerija;
	ImageView slika;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.galerijajevr); 
		galerija = (Gallery) findViewById(R.id.gallery3);
		slika = (ImageView) findViewById(R.id.imageView3);
		galerija.setAdapter(new ImageAdapter3(this));
		galerija.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_LONG);
				slika.setImageResource(ImageAdapter3.ThumbsIds3[position]);
				
			}
		});

}
}
