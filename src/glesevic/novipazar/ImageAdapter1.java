package glesevic.novipazar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter1 extends BaseAdapter implements SpinnerAdapter {

	private Context kontekst1;
	public ImageAdapter1(Context kontekst){
		this.kontekst1=kontekst;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds.length;
	}

	@Override
	public Object getItem(int arg0) {
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
			imageView= new ImageView(kontekst1);
			imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
			imageView.setPadding(8, 8, 8, 8);
		}else{
			imageView=(ImageView)convertView;
		}
		imageView.setImageResource(ThumbsIds[position]);
		return imageView;
	}
	public static Integer[] ThumbsIds={
			R.drawable.crnarekamdpi,
			R.drawable.djstupovimdpi,
			R.drawable.sopocanimdpi,
			R.drawable.svmarinamdpi,
			R.drawable.pcrkvamdpi
	};

}
