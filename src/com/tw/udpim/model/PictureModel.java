package com.tw.udpim.model;

import android.R.string;

public class PictureModel {
	private String title;
	private int imageID;
	/**
	 * Ĭ�Ϲ��캯��
	 */
	public PictureModel(){}
	/**
	 * 
	 * @param ͼ���ע
	 * @param ͼ��ID
	 */
	public PictureModel(String title,int imageID){
		this.title = title;
		this.imageID = imageID;
	}
	/**
	 * 
	 * @return ����ͼ���ע
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @param ����ͼ���ע
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * @return ����ͼ��ID
	 */
	public int getImageID() {
		return imageID;
	}
	/**
	 * 
	 * @param ����ͼ��ID
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	
}
