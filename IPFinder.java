package com.codegnan.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class IPFinder {

	public static void main(String[] args) throws IOException {
		/*InetAddress address=InetAddress.getLocalHost();
		System.out.println("Ip Address :"+address.getHostAddress());*/
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		InetAddress addr=InetAddress.getByName(name);
		System.out.println("Ip of the Host:"+addr);
	}

}
