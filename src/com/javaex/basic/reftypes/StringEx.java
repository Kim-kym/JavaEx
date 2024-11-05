package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		usingString();
		
	}
	private static void usingString() {
		String str; //	선언 -> null 상태
		str = "Java";	// 할당, Literal 상태(찍어놓은 상태) 
		String str2 = "Java";	//	Literal 선언과 동시에 할
		String str3 = new String("Java");	// 	새 객체 생성
		
		//	세 변수는 같은 값을 가지고 있다 
		//	객체의 경우, ==은 ㅏㅁ조 주소를 비교 
		
		System.out.println(str == str2);
		System.out.println(str == str3);
		
		//	객체의 경우, 값의 비교는 equals 메서드 
		System.out.println(str.equals(str3));
	}
}
