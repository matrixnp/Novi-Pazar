package glesevic.novipazar;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class Antun_Alem_dzamija extends MapActivity {

	MapView mapa;
	MyLocationOverlay kompas;
	MapController kontroler;
	long start;
	long stop;
	int x, y;
	GeoPoint dodirniPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aadzamija);

		mapa = (MapView) findViewById(R.id.mapView);
		mapa = (MapView) findViewById(R.id.mapView);
		mapa.setBuiltInZoomControls(true);
		Dodir t = new Dodir();
		List<Overlay> overlayList = mapa.getOverlays();
		overlayList.add(t);
		kompas = new MyLocationOverlay(Antun_Alem_dzamija.this, mapa);
		overlayList.add(kompas);
		kontroler = mapa.getController();
		GeoPoint point = new GeoPoint(43136729, 20518639);
		kontroler.animateTo(point);
		kontroler.setZoom(50);
	}

	public boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	class Dodir extends Overlay {
		@SuppressWarnings("deprecation")
		public boolean onTouchEvent(MotionEvent e, MapView m) {
			if (e.getAction() == MotionEvent.ACTION_DOWN) {
				start = e.getEventTime();
				x = (int) e.getX();
				y = (int) e.getY();
				dodirniPoint = mapa.getProjection().fromPixels(x, y);

			}
			if (e.getAction() == MotionEvent.ACTION_UP) {
				stop = e.getEventTime();
			}
			if (stop - start > 1500) {
				AlertDialog alert = new AlertDialog.Builder(
						Antun_Alem_dzamija.this).create();
				alert.setTitle("Izaberite opciju");
				alert.setButton2("Adresa",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub

								Geocoder geocoder = new Geocoder(
										getBaseContext(), Locale.getDefault());
								try {
									List<Address> adresa = geocoder.getFromLocation(
											dodirniPoint.getLatitudeE6() / 1E6,
											dodirniPoint.getLongitudeE6() / 1E6,
											1);
									if (adresa.size() > 0) {
										String prikazi = "";
										for (int i = 0; i < adresa.get(0)
												.getMaxAddressLineIndex(); i++) {
											prikazi += adresa.get(0)
													.getAddressLine(i) + "\n";
										}
										Toast t = Toast.makeText(
												getBaseContext(), prikazi,
												Toast.LENGTH_LONG);
										t.show();
									}
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} finally {

								}

							}
						});
				alert.setButton3("Dobiti Smer",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub

								Intent intent = new Intent(
										android.content.Intent.ACTION_VIEW,
										Uri.parse("google.navigation:q=an+Jugovica+Novi Pazar"));
								startActivity(intent);
							}
						});
				alert.show();
				return true;
			}
			return false;
		}
	}
}
