package com.tw.udpim.model;

import android.R.string;

public class PictureModel {
	private String title;
	private int imageID;
	/**
	 * 默认构造函数
	 */
	public PictureModel(){}
	/**
	 * 
	 * @param 图像标注
	 * @param 图像ID
	 */
	public PictureModel(String title,int imageID){
		this.title = title;
		this.imageID = imageID;
	}
	/**
	 * 
	 * @return 返回图像标注
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @param 设置图像标注
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * @return 返回图像ID
	 */
	public int getImageID() {
		return imageID;
	}
	/**
	 * 
	 * @param 设置图像ID
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	
}
