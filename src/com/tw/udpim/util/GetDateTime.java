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
			time+="星期日";
			break;
		case 1:
			time+="星期一";
			break;
		case 2:
			time+="星期二";
			break;
		case 3:
			time+="星期三";
			break;
		case 4:
			time+="星期四";
			break;
		case 5:
			time+="星期五";
			break;
		case 6:
			time+="星期六";
			break;
			default:
				break;
		}
		return time;
	}
}
