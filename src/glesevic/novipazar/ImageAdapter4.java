package glesevic.novipazar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter4 extends BaseAdapter implements SpinnerAdapter {
	
	private Context kontekst4;
	public ImageAdapter4(Context kontekst){
			this.kontekst4=kontekst;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds4.length;
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

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView=null;
		if(convertView==null){
			imageView= new ImageView(kontekst4);
			imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
			imageView.setPadding(8, 8, 8, 8);
		}else{
			imageView=(ImageView)convertView;
		}
		imageView.setImageResource(ThumbsIds4[position]);
		return imageView;
	}
	public static Integer[] ThumbsIds4={
			R.drawable.amirhanmdpi,
			R.drawable.bedemmdpi,
			R.drawable.motriljamdpi,
			R.drawable.rasmdpi,
			R.drawable.isabegovmdpi
			
	};
	}


