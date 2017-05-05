package com.tw.udpim.util;

public class BitToggleByte {
	public static String byteToBitByLength(int a,int lenth){
		byte[] bits = new byte[lenth];
		for(int i=0;i<lenth;i++){
			bits[i] = (byte)(a>>(lenth-i-1)&0x1);
		}
		StringBuffer sb = new StringBuffer();
		for(byte temp:bits){
				sb.append(temp);
			}
		return sb.toString();
	}
	public static byte BitToByte(String byteStr){
		int re,len;
		if(null == byteStr){
			return 0;
		}
		len = byteStr.length();
		if(len!=4 && len!=8){
			return 0;
		}
		if(len == 8){
			if(byteStr.charAt(0)=='0'){
				re = Integer.parseInt(byteStr,2);
			}else{
				re = Integer.parseInt(byteStr, 2)-256;
			}
		}else{
			re = Integer.parseInt(byteStr,2);
		}
		return (byte)re;
	}
	public static String byteToBit(byte b){
		byte[] bits = new byte[8];
		bits[0] = (byte)((b>>7)&0x1);
		bits[1] = (byte)((b>>6)&0x1);
		bits[2] = (byte)((b>>5)&0x1);
		bits[3] = (byte)((b>>4)&0x1);
		bits[4] = (byte)((b>>3)&0x1);
		bits[5] = (byte)((b>>2)&0x1);
		bits[6] = (byte)((b>>1)&0x1);
		bits[7] = (byte)((b>>0)&0x1);
		StringBuffer sb = new StringBuffer();
		for(byte temp:bits){
					sb.append(temp);
		}
		return sb.toString();
	}
	public static String byteToBit(byte[] b){
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<b.length;i++){
			byte[] bits = new byte[8];
			bits[0] = (byte)((b[i]>>7)&0x1);
			bits[1] = (byte)((b[i]>>6)&0x1);
			bits[2] = (byte)((b[i]>>5)&0x1);
			bits[3] = (byte)((b[i]>>4)&0x1);
			bits[4] = (byte)((b[i]>>3)&0x1);
			bits[5] = (byte)((b[i]>>2)&0x1);
			bits[6] = (byte)((b[i]>>1)&0x1);
			bits[7] = (byte)((b[i]>>0)&0x1);
			for(byte temp:bits){
				sb.append(temp);
				}
		}
		return sb.toString();
	}
}
