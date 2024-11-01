package com.javaex.basic.types;

import java.util.Scanner;

public class ScannerExSelf {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("your name please >>");
		String name = in.nextLine();
		System.out.println("hi" + name + "sang bokuwa kimito tukiaitai");
		
	}

}
