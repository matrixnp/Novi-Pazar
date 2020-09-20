package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pravoslavna extends Activity implements OnItemClickListener {

	private ListView lv1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pravoslavna);
		lv1 = (ListView) findViewById(R.id.pravoslavnalist);

		lv1.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.pravoslavna)));
		lv1.setOnItemClickListener(Pravoslavna.this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent i;
		switch (arg2) {
		case 0:
			i = new Intent(this, Crna_Reka.class);
			startActivity(i);
			break;
		case 1:
			i = new Intent(this, Djurdjevi_Stupovi.class);
			startActivity(i);
			break;
		case 2:
			i = new Intent(this, Sopocani.class);
			startActivity(i);
			break;
		case 3:
			i = new Intent(this, Sveta_Marina.class);
			startActivity(i);
			break;
		case 4:
			i = new Intent(this, Petrova_crkva.class);
			startActivity(i);
			break;

		case 5:
			i = new Intent(this, GalerijaPravo.class);
			startActivity(i);
			break;

		default:
			break;

		}
	}

}
