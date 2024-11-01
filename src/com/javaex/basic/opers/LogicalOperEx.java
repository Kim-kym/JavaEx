package com.javaex.basic.opers;
//	비교 연산과 논리 연산 
//	연산 결과는 항상 boolean 
public class LogicalOperEx {

	public static void main(String[] args) {
		int a = 7, b = 3;
		
		//	비교 연산자: 
		//	>, >=. <. <=, ==, != 
		System.out.println(a > b);
		System.out.println(a == b); 
		System.out.println(a != b);
		
		//	논리 연산  
		//	AND (&&), OR(||), NOT(!) 
		// 	논리연산은 집합 개념 
		int val = 5; 
		/*
		 * val가 0초과, val가 10 미만의 값인가? 
		 * 	조건 1: val > 0 ? 
		 * 	조건 2: val < 10 ?
		 * 	조건1 and 조건2 (교집합 영역)   
		 */
		boolean r1 = val > 0; 
		boolean r2 = val < 10;
		//	두 조건의 조합 
		boolean r1AndR2 = r1 && r2;
		System.out.println("r1 && rw => " + r1AndR2);
		
		System.out.println(val > 0 && val < 10);
		
		/*
		 * val 0이하 이거나 val 10이상의 값?
		 * 	조건1: val <= 0 ? 
		 * 	조건2: val >= 0?
		 * 	조건1: or 조건2 (합집합 영역>   
		 */
		boolean r3 = val <= 0; 
		boolean r4 = val >= 10;
		// 	두 조건의 집합 
		boolean r3OrR4 = r3 || r4; 
		System.out.println("r3 || r4 => " + r3OrR4);
		System.out.println(val <=0 || val >= 10);
		
		//	not -> 논리 부정 (여집함)
		boolean rNot = !(val > 0 && val < 10);
		System.out.println(rNot); 
		
		System.out.println(rNot == val <= 0 || val >= 10 );
		System.out.println(rNot == val <= 0 || val >= 10 );

	}

}
