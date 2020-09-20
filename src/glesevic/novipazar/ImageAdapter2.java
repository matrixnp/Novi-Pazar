package glesevic.novipazar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter2 extends BaseAdapter implements SpinnerAdapter {
	
	private Context kontekst2;
	public ImageAdapter2(Context kontekst){
			this.kontekst2=kontekst;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds2.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView=null;
		if(convertView==null){
			imageView= new ImageView(kontekst2);
			imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
			imageView.setPadding(8, 8, 8, 8);
		}else{
			imageView=(ImageView)convertView;
		}
		imageView.setImageResource(ThumbsIds2[position]);
		return imageView;
	}
	public static Integer[] ThumbsIds2={
			R.drawable.aadzamijamdpi,
			R.drawable.arapdzamijamdpi,
			R.drawable.begovamdpi,
			R.drawable.bordmdpi,
			R.drawable.isabegovmdpi,
			R.drawable.isahmdpi,
			R.drawable.lejlekmdpi,
			R.drawable.kolerinamdpi
	};

	
}
