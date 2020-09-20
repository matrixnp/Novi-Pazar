package glesevic.novipazar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter3 extends BaseAdapter implements SpinnerAdapter {
		
		private Context kontekst3;
		public ImageAdapter3(Context kontekst){
				this.kontekst3=kontekst;
		}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds3.length;
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
			imageView= new ImageView(kontekst3);
			imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
			imageView.setPadding(8, 8, 8, 8);
		}else{
			imageView=(ImageView)convertView;
		}
		imageView.setImageResource(ThumbsIds3[position]);
		return imageView;
	}
	public static Integer[] ThumbsIds3={
			R.drawable.sinagogamdpi,
			R.drawable.jgorbljemdpi
			
	};
	}


