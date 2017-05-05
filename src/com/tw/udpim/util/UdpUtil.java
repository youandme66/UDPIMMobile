package com.tw.udpim.util;

import java.net.DatagramPacket;

public class UdpUtil {
	private byte[] bt;
	private DatagramPacket packet;
	private UdpUtil() {}
	public static UdpUtil getInstance(){
		return SingletonInstance.instance;
	}
	private static class SingletonInstance{
		static UdpUtil instance = new UdpUtil();
	}
	public void beginTranformData(){
		
	}
}
