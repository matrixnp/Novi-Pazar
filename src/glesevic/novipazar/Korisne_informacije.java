package glesevic.novipazar;

import java.util.ArrayList;

import glesevic.expandListView.Adapter.ExpandListAdapter;
import glesevic.expandListView.Classes.*;
import glesevic.novipazar.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class Korisne_informacije extends Activity {
	private ExpandableListAdapter ExpAdapter;
	private ArrayList<ExpandListGroup> ExpListItems;
	private ExpandableListView ExpandList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		ExpandList = (ExpandableListView) findViewById(R.id.ExpList);
		ExpListItems = SetStandardGroups();
		ExpAdapter = new ExpandListAdapter(Korisne_informacije.this,
				ExpListItems, ExpListItems);

		ExpandList.setAdapter(ExpAdapter);
	}

	public ArrayList<ExpandListGroup> SetStandardGroups() {
		ArrayList<ExpandListGroup> list = new ArrayList<ExpandListGroup>();
		ArrayList<ExpandListChild> list2 = new ArrayList<ExpandListChild>();
		ExpandListGroup grupa1 = new ExpandListGroup();
		grupa1.setName("Policija");
		ExpandListChild ch1_1 = new ExpandListChild();
		ch1_1.setName("Telefon: 020-314-744, 92");
		ch1_1.setTag(null);
		list2.add(ch1_1);
		ExpandListChild ch1_2 = new ExpandListChild();
		ch1_2.setName("Adresa: 37. Sandzacke Divizije");
		ch1_2.setTag(null);
		list2.add(ch1_2);
		grupa1.setItems(list2);
		list2 = new ArrayList<ExpandListChild>();

		ExpandListGroup grupa2 = new ExpandListGroup();
		grupa2.setName("Zdravstveni centar");
		ExpandListChild ch2_1 = new ExpandListChild();
		ch2_1.setName("Telefon: 020-314-722, 312-816");
		ch2_1.setTag(null);
		list2.add(ch2_1);
		ExpandListChild ch2_2 = new ExpandListChild();
		ch2_2.setName("Adresa: Generala Zivkovica");
		ch2_2.setTag(null);
		list2.add(ch2_2);
		grupa2.setItems(list2);
		list2 = new ArrayList<ExpandListChild>();
		ExpandListGroup grupa3 = new ExpandListGroup();
		grupa3.setName("Sud");
		ExpandListChild ch3_1 = new ExpandListChild();
		ch3_1.setName("Telefon: 020-314-381");
		ch3_1.setTag(null);
		list2.add(ch3_1);
		ExpandListChild ch3_2 = new ExpandListChild();
		ch3_2.setName("Adresa: Zitni trg br 1");
		ch3_2.setTag(null);
		list2.add(ch3_2);
		grupa3.setItems(list2);
		list2 = new ArrayList<ExpandListChild>();
		ExpandListGroup grupa4 = new ExpandListGroup();
		grupa4.setName("Autobuska Stanica");
		ExpandListChild ch4_1 = new ExpandListChild();
		ch4_1.setName("Telefon: 020- 318-354");
		ch4_1.setTag(null);
		list2.add(ch4_1);
		ExpandListChild ch4_2 = new ExpandListChild();
		ch4_2.setName("Adresa: Omladinska 1");
		ch4_2.setTag(null);
		list2.add(ch4_2);
		grupa4.setItems(list2);
		list2 = new ArrayList<ExpandListChild>();
		list.add(grupa1);
		list.add(grupa2);
		list.add(grupa3);
		list.add(grupa4);

		return list;
	}

}
