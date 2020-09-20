package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Gde_odsesti extends Activity implements OnItemClickListener {

	private ListView lv5 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gdeodsesti);
		lv5 = (ListView) findViewById(R.id.hotelilist);

		lv5.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.hoteli)));
		lv5.setOnItemClickListener(Gde_odsesti.this);

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent i;
		switch (arg2) {
		case 0:
			i = new Intent(this, Vrbak.class);
			startActivity(i);
			break;
		case 1:
			i = new Intent(this, Tadz.class);
			startActivity(i);
			break;
		case 2:
			i = new Intent(this,  MSopocani.class);
			startActivity(i);
			break;

		default:
			break;
		}

	}

}
