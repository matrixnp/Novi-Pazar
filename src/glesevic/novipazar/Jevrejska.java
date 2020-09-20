package glesevic.novipazar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Jevrejska extends Activity implements OnItemClickListener {
	private ListView lv3 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jevrjeska);

		lv3 = (ListView) findViewById(R.id.jevrjeskalist);

		lv3.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.jevrjeska)));
		lv3.setOnItemClickListener(Jevrejska.this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
			Intent i ;
			
			switch (arg2) {
			case 0:	
				i = new Intent(this, Jevrjesko_groblje.class);
				startActivity(i);
				break;
			case 1:
				i = new Intent(this, Sinagoga.class);
				startActivity(i);
			case 2:
				i = new Intent(this, GalerijaJevr.class);
				startActivity(i);
				break;
			default:
				break;
			}
	}

}