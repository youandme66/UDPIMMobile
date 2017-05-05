package com.tw.udpim.util;

public class IntToByte {
	public static byte[] changeInt16(int data){
		byte[] bt = new byte[2];
		bt[1] = (byte)(data&0xFF);
		bt[0] = (byte)(data>>8&0xFF);
		return bt;
	}
	public static byte[] changeInt32(int data){
		byte[] bt = new byte[4];
		bt[3] = (byte) (data&0xFF);
		bt[2] = (byte) (data>>8&0xFF);
		bt[1] = (byte) (data>>16&0xFF);
		bt[0] = (byte) (data>>32&0xFF);
		return bt;
	}
}
