package com.javaex.bagic.flow;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
		whileGugu();
	}
	
//	private static void whileEx() {
//		//	while (condition) { }
//		//	: condition이 참인 동안 블록을 반복 
//		/* 
//		 * I like Java0
//		 * I like Java1
//		 * I like Java2
//		 * I like Java3
//		 * I like Java4
//		 */
//		int i = 0; //	반복 제어 변수 
//		
//		while ( i < 5 ) {
//			System.out.println("I like Java" + i);
//			//	주의: 반복 제어변수를 잘 조정해야 한다(false가 되어야 한다)
//			i += 1;
//		}
		private static void whileGugu () {
			//	단을 입력 받아서 해당 단의 구구표를 출력 
			System.out.println("단을 입력해주세요 >>");
			Scanner scanner = new Scanner(System.in);
			int gugu = scanner.nextInt();
			int i = 1;
			while(i < 10) {
				System.out.println( gugu +" * "+ i + " = " + i*gugu);
				i += 1;
			}
			System.out.println("당신은 8단 마스터!");
	}
}
