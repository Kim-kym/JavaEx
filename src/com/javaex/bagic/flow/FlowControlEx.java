package com.javaex.bagic.flow;

public class FlowControlEx {

	public static void main(String[] args) {
//		continueEx ();
//		breakEx ();
//		forWhileEx ();
		forWhileEx2 ();
		
	}
	private static void continueEx() {
		//	continue : 반복 블록 내부에서 남아있는 문장을 실행하지 않고 다음번 루트로 진행 
		
		//	1 ~ 100 루프를 돌면서 2의 배수와 3의 배수가 아닌 숫자만 출력 
		for (int i = 1; //	초기화 
			i <= 100;  //	반복 조건
			++i) {
			if ( i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}
		
	}
	public static void breakEx() {
		//	break : 반복 블록 내부에서 남아있는 문장은 실행하지 않고 블록을 탈출 
		
		//	6과 14로 모두 나누어 떨어지는 수를 구하자. 
		
		int num = 1;
		
		while (true) { 	//어디까지 가야 원하는 값이 나올지 모르니까
			if(num % 6 == 0 && num % 14 == 0) 
				break; 
			++num;
		}
		System.out.println("6과 14의 최소공배수: " + num);
	}
	private static void forWhileEx () {
		int i = 2;
		while ( i < 10 ) {
			for ( int j = 1; j < 10; ++j ) {
				System.out.println(i + "*" + j + " = " + i*j); 
			} System.out.println("\n");
			++i;
		}
	}
	private static void forWhileEx2 () {
		for(int i = 1; i < 7; ++i) {
			switch (i) {
			case 1: 
			System.out.println("*");
			break;
			
			case 2: 
			System.out.println("**");
			break;
			
			case 3:	
			System.out.println("***");
			break;
			
			case 4:
			System.out.println("****");
			break;
			
			case 5:
			System.out.println("*****");
			break;
			
			case 6: 
			System.out.println("******");
			break;
			}
		}
			
	}
	
}
