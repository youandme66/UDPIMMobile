package com.tw.udpim.util;

import java.util.ArrayList;
import java.util.List;

import com.tw.udpim.R;
import com.tw.udpim.model.PictureModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PictureAdapter extends BaseAdapter{
	private LayoutInflater inflater;
	private List<PictureModel> pictures;
	public PictureAdapter(String[] titles,int[] imageIDs,Context context){
		super();
		inflater = LayoutInflater.from(context);
		pictures = new ArrayList<PictureModel>();
		for(int i = 0;i<titles.length;i++){
			PictureModel picture = new PictureModel(titles[i],imageIDs[i]);
			pictures.add(picture);
		}
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if(pictures!=null){
			return pictures.size();
		}else{
			return 0;
		}
	}
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return pictures.get(position);
	}
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		class ViewHolder{
			public TextView text;
			public ImageView image;
		}
		ViewHolder viewHolder = new ViewHolder();
		if(convertView == null){
			convertView = inflater.inflate(R.layout.picture_item, null);
			viewHolder.text = (TextView) convertView.findViewById(R.id.ItemTitle);
			viewHolder.image = (ImageView) convertView.findViewById(R.id.ItemImage);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.text.setText(pictures.get(position).getTitle());
		viewHolder.image.setImageResource(pictures.get(position).getImageID());
		return convertView;
	}
}
