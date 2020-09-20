package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Islamska extends Activity implements OnItemClickListener {

	private ListView lv2 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.islamska);
		lv2 = (ListView) findViewById(R.id.islamskalist);

		lv2.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.islamska)));
		lv2.setOnItemClickListener(Islamska.this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent i;
		switch (arg2) {
		case 0:
			i = new Intent(this, Antun_Alem_dzamija.class);
			startActivity(i);
			break;
		case 1:
			i = new Intent(this, Arap_Dzamija.class);
			startActivity(i);
			break;
		case 2:
			i = new Intent(this, Lejlek_Dzamija.class);
			startActivity(i);
			break;
		case 3:
			i = new Intent(this, Bor_dzamija.class);
			startActivity(i);
			break;
		case 4:
			i = new Intent(this, Begova_dzamija.class);
			startActivity(i);
			break;

		case 5:
			i = new Intent(this, Kolerina_dzamija.class);
			startActivity(i);
			break;

		case 6:
			i = new Intent(this, Isah_dzamija.class);
			startActivity(i);
			break;
		case 7:
			i = new Intent(this, GalerijaIsam.class);
			startActivity(i);
			break;

		default:
			break;

		}
	}

}