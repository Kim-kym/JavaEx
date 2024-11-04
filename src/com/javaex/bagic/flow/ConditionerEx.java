package com.javaex.bagic.flow;

import java.util.Scanner;

public class ConditionerEx {

	public static void main(String[] args) {
//		ifEx();
//		ifEx2();
//		ifPractice01();
//		switchEx();		
//		switchEx2();
//		switchPractice();
//	    ifSwitchEx();
	    ifSwitchEx2();
		
	}
/*	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
//		점수를 입력 받아서 60점 이상이면 합격입니다.
		System.out.print("점수를 입력하세요 >>");
		int score = scanner.nextInt();
		//	if ~ else ~
		if ((score >= 60) && (score < 100)) {
			System.out.println("합격입니다");
			//조건 불만족시 
		} else if (score < 60) {
			System.out.println("불합격입니다");
		} else if (score == 100) {
			System.out.println("축하드립니다. 합격입니다.");
		}
		
		scanner.close();
	
		
	}
	/*	private static void ifEx2() {
		//	if ~ else if ~ else ~ 
		//	정수 입력 받아서 양수, 0, 음수인지 판별 
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>");
		int num = scanner.nextInt();
		
		//	조건 1: 0 체크 -> 나머지: 양수 or 음수 
		//	조건 2: 양수 체크 -> 나머지: 음수 
		
		//	일반적인 순차 조건 분기 
		if (num == 0) {
			System.out.println("0입니다.");
		} else if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}*/
		
		//	중첩 if
/*		if ( num == 0) {
			System.out.println("0입니다.");
		} else {
			//	양수 or 음수 
			if (num > 0) {
				System.out.println("양수입니다");
			} else {
				System.out.println("음수입니다");
			}
		}
		scanner.close();

//	private static void ifPractice01() {
			//	과목번호 입력 -> 강의실 번호 출력
			// 1 -> R101입니다.
			// 2 -> R202입니다.
			// 3 -> R303입니다.
			// 4 -> R404입니다.
			// 나머지 -> 상담원에게 문의하세요 
/*			System.out.print("과목을 선택하세요"
					+"\n(1.자바  2.C  3.C++  4.파이썬)"
					+"\n 과목번호: ");
			Scanner scanner = new Scanner(System.in);
			int code = scanner.nextInt();
			if (code == 1) {
				System.out.println("R101호 입니다"); 
			} else if (code == 2) {
				System.out.println("R202호 입니다");
			} else if (code == 3) {
				System.out.println("R303호 입니다");
			} else if (code == 4) {
				System.out.println("R404호 입니다");
			} else { 
				System.out.println("상담원에게 문의하세요."); 
			}
		
			scanner.close(); 
		}
	*/	
//		private static void switchEx() {
//			System.out.print("과목을 선택하세요"
//					+"\n(1.자바  2.C  3.C++  4.파이썬)"
//					+"\n 과목번호: ");
//			Scanner scanner = new Scanner(System.in);
//			int subj = scanner.nextInt();
//			switch (subj) {
//			case 1:	//	sybj == 1
//				System.out.println("R101 입니다.");
//				break;
//			case 2:	//	subj == 2
//				System.out.println("R202 입니다.");
//				break;
//			case 3: //	subj == 3
//				System.out.println("R303 입니다.");
//				break;	
//			case 4:	//	subj == 4
//				System.out.println("R404 입니다.");
//				break;
//			default: //	else
//				System.out.println("상담원에게 문의하세요");
//				break;
//			}
//			
//			scanner.close();
//		}
//		
//		private static void switchEx2() {
//			//	1, 3, 5, 7, 8, 10, 12월 -> 31일 
//			// 2월 -> 28일 
//			// 4, 6, 9, 11월 -> 30일 
//			System.out.print("월을 입력하세요" + "\n>>");
//			Scanner scanner = new Scanner(System.in);
//			int month = scanner.nextInt ();
//			switch (month) {
//			case 1, 3, 5, 7, 8, 10, 12:  
//				System.out.println("는 31일 입니다.");
//				break;
//			case 2:
//				System.out.println("는 28일 입니다.");
//				break;
//			case 4, 6, 9, 11: 
//				System.out.println("는 30일 입니다.");
//				break;
//			default:
//				System.out.println("bakana"); 
//		    }
//			scanner.close();
//		}
		
//		private static void switchPractice() {
//			//	TODO: 이 코드를 나중에 enum (열거형) 객체로 다시 만들 예정
//			
//			//	문자열 변수에 문자열로 요일 정보를 입력
//			//	"SUNDAY" -> 휴식 
//			//	"MONDAY" ~ "THURSDAY" -> 열공
//			//	"FRIDAY" -> 열공후 불금
//			//	"SATURDAY" -> 주말
//			String day = "MONDAY";
//			String action;
//			
//			switch (day) {
//			case "SUNDAY": 
//				action = "휴식";
//				break;
//			case "MONDAY": 
//			case "TUESDAY":
//			case "WEDNESDAY":
//			case "THURSDAY": 
//				action = "열공";
//				break;
//			case "SATURDAY":
//				action = "주말";
//				break;
//			default: 
//				action = "??"; 
//				break;
//			}
//			
//			System.out.println(day + "에는 " + action);
//			
//			}
//		private static void ifSwitchEx() {
//			
//		System.out.print("점수를 입력하세요 >>");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		if (num % 3 == 0) { 
//			System.out.println("3의 배수 입니다.");
//		} else { System.out.println(num + "은 3의 배수가 아닙니다.");		
//		}
//	}	
//}

		private static void ifSwitchEx2() {
			System.out.print("점수를 입력하세요 >>");
			Scanner scanner = new Scanner(System.in);
			int score = scanner.nextInt();
			if (score >= 90) {
				System.out.println("A등급");
			} else if 
			((score >= 80) && (score < 90)) {
				System.out.println("B등급");
			} else if 
			((score >= 70) && (score < 80)) {
				System.out.println("C등급");
			} else if 
			((score >= 60) && (score < 70)) {
				System.out.println("D등급");
			} else {
				System.out.println("F등급");
			}
		}
	}
