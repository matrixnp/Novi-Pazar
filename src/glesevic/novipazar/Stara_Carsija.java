package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Stara_Carsija extends Activity implements OnItemClickListener {

	private ListView lv4 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stara_carsija);

		lv4 = (ListView) findViewById(R.id.scarsijalist);

		lv4.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.carsija)));
		lv4.setOnItemClickListener(Stara_Carsija.this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		Intent i;
		
		switch (arg2) {
		case 0:
			i = new Intent(this,  Gazi_Isa_Begov_hamam.class);
			startActivity(i);
			break;
		case 1:
			i = new Intent(this, Amir_agin_han.class);
			startActivity(i);
			break;
		case 2:
			i = new Intent(this, Bedem.class);
			startActivity(i);
			break;
		case 3:
			i = new Intent(this, Kula_Motrilja.class);
			startActivity(i);
			break;
		case 4:
			i = new Intent(this, Trgoviste_Stari_Ras.class);
			startActivity(i);
			break;
		case 5:
			i = new Intent(this, GalerijaStara.class);
			startActivity(i);
			break;

		default:
			break;
		}

	}

}