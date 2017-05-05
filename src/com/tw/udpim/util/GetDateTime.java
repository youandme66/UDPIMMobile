package com.tw.udpim.util;

import java.util.Calendar;
import java.util.Date;

import com.tw.udpim.R.string;

public class GetDateTime {
	private Calendar cal;
	private String month;
	private String day;
	public GetDateTime() {
		// TODO Auto-generated constructor stub
		this.cal = Calendar.getInstance();
	}
	public String dealDate(){
		month = (cal.get(Calendar.MONTH)+1)+"";
		day = cal.get(Calendar.DAY_OF_MONTH)+"";
		if(month.length()<2){
			month = "0"+month;
		}
		if(day.length()<2){
			day = "0"+day;
		}
		String time = "";
		time+=cal.get(Calendar.YEAR)+"/"+month+"/"+day+" ";
		switch(cal.get(Calendar.DAY_OF_WEEK)-1){
		case 0:
			time+="������";
			break;
		case 1:
			time+="����һ";
			break;
		case 2:
			time+="���ڶ�";
			break;
		case 3:
			time+="������";
			break;
		case 4:
			time+="������";
			break;
		case 5:
			time+="������";
			break;
		case 6:
			time+="������";
			break;
			default:
				break;
		}
		return time;
	}
}
